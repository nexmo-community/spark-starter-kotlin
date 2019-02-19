package com.nexmo.starter

import spark.kotlin.*

class App

fun main() {
    // Set the listening port to 3000
    port(3000)

    // Register the routes
    get("/example") { "Hello world!" }
    post("/example") { "Hello world!" }
}