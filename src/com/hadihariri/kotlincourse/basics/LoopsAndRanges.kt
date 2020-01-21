package com.hadihariri.kotlincourse.basics

fun main() {

    for(a in 1..100) { // .. ==> a range of numbers
        println(a)
    }

    val numbers = 1..100 // .. ==> a range of numbers
    for(a in numbers) {
        print(a) // no new line <ln>
    }

    for (a in 100 downTo 1) {
        println(a)
    }

    for (a in 100..1) {
        println(a)
    }

    for (b in 100 downTo 1 step 5) {
        println(b)
    }

    val capitals = listOf("London", "Paris", "Uruguai")
    for (capitals in capitals) {
        println(capitals)
    }

    var i = 100
    while (i > 0) {
        i--
    }

    do {
        var x = 10
        x--
    } while (x > 10)
}