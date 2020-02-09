package com.hadihariri.kotlincourse.classes

data class CustomerKotlin (var id: Int, var name: String, var email: String)

// DATA - avoid create boilplater code for toString, get hash, euqals code (a MODIFIER)

fun main(args: Array<String>) {

    val customer1 = CustomerKotlin(1, "Fabi", "mail@mail.com")
    val customer2 = CustomerKotlin(1, "Fabi", "mail@mail.com")

    val customer3 = customer1

    // println(customer)"
    if (customer1 == customer2) {
        println("They are the same")
    }

    // ability to copy objects
    val customer4 = customer1.copy(email = "wire@wire.com")
    println(customer4.id)
    println(customer4.name)
    println(customer4.email)

    // customer1.copy()

}