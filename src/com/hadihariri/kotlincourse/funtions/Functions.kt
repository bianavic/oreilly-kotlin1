package com.hadihariri.kotlincourse.funtions

// returning is VOID, so we use return type Unit. BUT Unit is a OBJECT
fun hello(): Unit {
    println("Hello")
}

// return type NOTHING / a value that NEVER EXIST, NEVER RETURNS
// returns an EXCEPTION
// Nothing is a class with a private constructor
fun throwingException(): Nothing {
    throw Exception("This function returns an exception")
}

// return a value
// declare the type a function returns
fun returnAFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

// the compiler already know the types is passing in
//fun sum(x: Int, y: Int): Int = x + y

// function that has a SINGLE expression
fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {

    hello()

    val value = returnAFour()

    takingString("Some Value")

}

