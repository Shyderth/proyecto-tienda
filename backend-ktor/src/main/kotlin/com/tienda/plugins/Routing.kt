package com.tienda.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        singlePageApplication {
            react("C:\\ProyectosWeb\\proyecto-tienda\\vite-app\\dist")
        }
        get("/api") {
            call.respondText("Hello World!")
        }
    }
}
