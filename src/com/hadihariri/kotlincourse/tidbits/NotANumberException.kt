package com.hadihariri.kotlincourse.tidbits

import java.lang.IllegalArgumentException

class NotANumberException(message: String) : Throwable(message) {
}

fun chckIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a Number")
    }
}

fun main(args: Array<String>) {

    // throw NotANumberException()

    try {
        chckIsNumber("A")
    } catch (e: IllegalArgumentException) {
        println("Do Nothing")
    }
    catch (e: NotANumberException) {
        println("${e.message}")
    }

}