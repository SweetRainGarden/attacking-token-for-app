package com.sweetraingarden

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.sweetraingarden.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureAdministration()
        configureSockets()
        configureSerialization()
        configureSecurity()
        configureRouting()
    }.start(wait = true)
}
