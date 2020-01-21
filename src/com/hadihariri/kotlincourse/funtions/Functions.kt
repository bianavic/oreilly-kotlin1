package com.hadihariri.kotlincourse.funtions

fun hello(): Unit {
    println("Hello")
}

fun throwingException(): Nothing {
    throw Exception("This function returns an exception")
}

fun returnAFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

// MULTIPLE PARAMETERS
fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

fun printDetails(name: String, email: String = "", phone: String) { // make String default
    println("name: $name - email: $email - phone: $phone")
}

// kotlin has DEFAULT parameters.
// so without declaring the third parameter
// it will default it to zero
fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {

    hello()

    val value = returnAFour()

    takingString("Some Value")

    // have multiple parameters but i will ONLY pass a specific one and not another
    sum(1, 2, 3)
    sum(1, 2)

    printDetails("Fabi", phone = "543 66 6") // passing the third parameter

    // it doesnt define the order of values, like reversing the order, changing the way we like

}

