package com.hadihariri.kotlincourse.classes

import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS
import java.lang.IllegalArgumentException
import java.util.*

// U can ONLY declare PROPERTIES
// create a customer Class with 2 properties
//class Customer {
//    var id = 0 // declaring a property
//    var name: String = "" // initialize the value
//}

// simplify | 2 arguments that are properties too
// if i remove the VAR then its no longer the property, its just a value been passed as part of constructor
class Customer(var id: Int, var name: String, val yearOfBirth: Int) {
//    init {
//        name = name.toUpperCase()
//    }
//
//    // equivalents blocks (init and constructor)
//    // can create others constructors after a default constructor
//    constructor(email: String): this(0, "") {
//
//    }

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

//    // declare a variable + write the name of the class
//    val customer = Customer()
//    // access the instance
//    customer.id = 10
//    customer.name = "Fabi"

    val customer = Customer(10, "Fabi", 1978)
    customer.name
    customer.id
    customer.socialSecurityNumber = "SN1234"

    println(customer.customerAsString())

    println(customer.name)
    println(customer.age)
    println(customer.socialSecurityNumber)
}