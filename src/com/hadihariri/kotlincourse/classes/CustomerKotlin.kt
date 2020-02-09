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


/*        val customer3 = customer1
    // println(customer)

    // ability to COPY OBJECTS
    if (customer1 == customer2) {
        println("They are the same")
    }

    // COPY FUNCTIONS
    val customer4 = customer1.copy(email = "wire@wire.com")
    println(customer4.id)
    println(customer4.name)
    println(customer4.email)

    // customer1.copy()*/

}