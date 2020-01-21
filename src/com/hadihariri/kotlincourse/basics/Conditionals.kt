package com.hadihariri.kotlincourse.basics

fun main(args: Array<String>) {

    val myString = "Not Empty"

    // if <if> is a expression so i can assign a val
    // IF conditional is TRUE will RETURN a number (20) else will return a STRING
    val result = if (!myString.equals("")) {
        // it s casting this expression to ANY
        "Not Empty"
        20
    } else {
        "Is Empty" // kotlin DOESNT return LAST VALUE
    }
    println(result)
}