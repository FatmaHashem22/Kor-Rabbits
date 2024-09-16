package com.example.routes

import com.example.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.1.235:8080"

private val rabbits = listOf(
    Rabbit("Carl","A cute brown rabbit","$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("Finn and Lucy","They always love to play together","$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("Gina","Gina is a true beauty","$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("Federico","Federico likes to climb things","$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("Max","Max is always hungry","$BASE_URL/rabbits/rabbit5.jpg"),
)

fun Route.randomRabbit() {
    get("/randomrabbit") {
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}