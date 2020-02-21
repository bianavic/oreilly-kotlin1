package com.hadihariri.kotlincourse.funtions

import com.hadihariri.kotlincourse.functional.unaryOperation


// clojure = this unitary operation, which has this lambda, is able to access the variable declared in this function
fun outsideFunction() {

    for (number in 1..30)
//    val number = 10

    unaryOperation(20, { x ->
        println(number)
        x * number
    })
}

fun main(args: Array<String>) {

    outsideFunction()
}