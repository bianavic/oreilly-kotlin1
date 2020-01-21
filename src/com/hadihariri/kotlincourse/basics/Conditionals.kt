package com.hadihariri.kotlincourse.basics

//fun main(args: Array<String>) {
//
//    var myString = "Not Empty"
//
//    // if <if> is a expression so i can assign a val
//    // IF conditional is TRUE will RETURN a number (20) else will return a STRING
//    val result = if (!myString.equals("")) {
//        // it s casting this expression to ANY
//        println("Not Empty")
//    }


//        20
//    } else {
//        "Is Empty" // kotlin DOESNT return LAST VALUE
//    }
//    println(result)

    // WHEN = the result can have a value or a String and then execute that block
    fun main(args: Array<String>) {
        val result = "Value"
        when (result) {
            "Value" -> println("It's a value")
            is String -> println("Excellent")
//        "Value" -> println("It's a value")
    }
}