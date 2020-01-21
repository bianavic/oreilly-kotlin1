package com.hadihariri.kotlincourse.basics

    // WHEN = the result can have a value or a String and then execute that block
//    fun main(args: Array<String>) {
//        val result = "Value"
//        when (result) {
//            "Value" -> {
//                println("It's a Value") // it break down the execution
//                println("Second statement")
//            }
//            is String -> println("Excellent")
////        "Value" -> println("It's a value")
//    }
//
//        // how to handle other situations
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
//        "Value" -> println("It's a value")
            }
        println(whenValue)
}