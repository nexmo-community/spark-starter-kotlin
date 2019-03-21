package com.nexmo.starter

import spark.kotlin.get
import spark.kotlin.port
import spark.kotlin.post

class App

const val PORT = 3000

fun main() {
    // Set the listening port to 3000
    port(getPort())

    // Register the routes
    get("/example") { "Hello world!" }
    post("/example") { "Hello world!" }
}

fun getPort(): Int {
    val port = System.getenv("PORT")
    return if (port != null) port.toInt() else PORT
}