package com.myapi.routes

import com.myapi.data.model.Car
import io.ktor.routing.*

private const val BASE_URL = "localhost:8080"

private val cars = listOf(
    Car("Audi", "my best flexing ride", "BASE_URL/cars/audi"),
    Car("Mercedes", "my favourite vehicle brand", "BASE_URL/cars/mercedes"),
    Car("Mobius", "my richest vehicle manufacturer","BASE_URL/cars/mobius"),
    Car("Tesla", "the best vehicle to purchase","BASE_URL/cars/tesla"),
    Car("RR", "lets roll with the big boyz","BASE_URL/cars/rollsroyce")
)

fun Route.randomCar(){
    get("/randomCar"){

    }
}