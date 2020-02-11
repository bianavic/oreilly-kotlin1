package com.hadihariri.kotlincourse.inheritance

// we dont have to EXPLICIT put ANY. It is a base class with members like EQUALS, HASHCODE, TOSTRING
/*
class Customer: Any() {
}*/

// base class
// type OPEN to Customer inherit from Person
open class Person {
    open fun validate() {
    }
    constructor(): super() {
    }
}

// about FINAL type
open class Customer: Person() {
    final override fun validate() { // any open function cannot be overriden
    }
}

class SpecialCustomer: Customer() {
}

fun main(args: Array<String>) {
    // create a customer class
    val customer = Customer()
    customer.validate()
}