package com.hadihariri.kotlincourse.classes

import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS
import java.lang.IllegalArgumentException
import java.util.*

class Customer(var id: Int, var name: String, val yearOfBirth: Int) {

    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""

        // JUST just CHECKED the value , didnt SET
    set(value) {
        if (!value.startsWith("SN")) {
            throw IllegalArgumentException("Social Security should start with SN")
        }
            // special field that holds the value of t he property
            field = value
    }

    fun customerAsString(): String{
        return "Id: $id - Name: $name"
    }
}

// create instances of classes
fun main(args: Array<String>) {

    val customer = Customer(10, "Fabi", 1978)
    customer.name
    customer.id
    customer.socialSecurityNumber = "SN1234"

    println(customer.customerAsString())

    println(customer.name)
    println(customer.age)
    println(customer.socialSecurityNumber)
}