package com.hadihariri.kotlincourse.tidbits

class NotANumberException: Throwable() {
}

fun chckIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException()
    }
}

fun main(args: Array<String>) {

    // throw NotANumberException()

    try {
        chckIsNumber("A")
    } catch (e: NotANumberException) {
        println("It is not a number")
    }

}