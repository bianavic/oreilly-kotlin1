package com.hadihariri.kotlincourse.basics

        fun main(args: Array<String>) {

            val result = "Value"
            val whenValue = when (result) {
                "Value" -> {
                    println("It's a Value") // it break down the execution
                    println("Second statement")
                    "Returning the first when case"
                }
                is String -> println("Excellent")
                else -> println("It came to this?")
            }
        println(whenValue)
}