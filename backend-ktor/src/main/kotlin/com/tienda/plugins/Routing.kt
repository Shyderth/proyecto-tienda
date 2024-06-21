package com.tienda.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        singlePageApplication {
            react("C:\\ProyectosWeb\\proyecto-tienda\\vite-app\\dist")
        }
        get("/api/user/{name}") {
            val name = call.parameters["name"] ?: "usuario"
            call.respondText(text = "Bienvenido $name!", status = HttpStatusCode.OK)
        }
    }
}
