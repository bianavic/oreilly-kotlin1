package com.hadihariri.kotlincourse.classes

data class CustomerKotlin (var id: Int, var name: String, var email: String) {
    override fun toString(): String {

        // return JSON (SCAPE lines)
        // or USE INTELLIJ or edit injection to return JSON
        return "{\"id\": \"$id\", \"name\": \"$name\"}"
    }
}

// DATA - avoid create BOILERPLATE INTEROPERABILITY code for toString, get hash, equals code (a MODIFIER)

fun main(args: Array<String>) {


    val customer1 = CustomerKotlin(1, "Fabi", "mail@mail.com")
    val customer2 = CustomerKotlin(1, "Fabi", "mail@mail.com")

    // print as JSON
    println(customer1)
    println(customer2)

}