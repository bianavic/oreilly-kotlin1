package com.hadihariri.kotlincourse.funtions

// MULTIPLE PARAMETERS
fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

fun printDetails(name: String, email: String = "", phone: String) { // make String default
    println("name: $name - email: $email - phone: $phone")
}

// kotlin has DEFAULT parameters.
// so without declaring the third parameter
// it will default it to zero

// I can pass ANY number of parameters
fun printStrings(vararg strings: String) {
    reallyPrintingStrings(*strings) // SPREAD OPERATOR
}

// refactor > extract function
private fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }

}

fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {

    // have multiple parameters but i will ONLY pass a specific one and not another
    sum(1, 2, 3)
    sum(1, 2)

    printDetails("Fabi", phone = "543 66 6") // passing the third parameter
    // it doesnt define the order of values, like reversing the order, changing the way we like


    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")
    printStrings("1", "2", "3", "4")

}

