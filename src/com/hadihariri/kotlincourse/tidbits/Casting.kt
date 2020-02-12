package com.hadihariri.kotlincourse.tidbits

open class Person {

}

class Employee: Person() {
    fun vacactionDays(days: Int) {
        if (days < 60) {
            println("You need a vacation")
        }
    }
}

class Contractor: Person() {

}

/*
fun hasVacation(obj: Person) {
    if (obj is Employee) {
        obj.vacactionDays(20) // SMART CAST
    }
}
*/

var input: Any = 10

fun main(args: Array<String>) {

    val str = input as? String
    println(str?.length)


}