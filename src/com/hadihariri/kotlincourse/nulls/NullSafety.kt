package com.hadihariri.kotlincourse.nulls

import com.hadihariri.kotlincourse.classes.CustomerJava

class Service {
    fun evaluate() {}
}
class ServiceProvider {
    fun createService(): Service? {}
}

fun main(args: Array<String>) {

    val message: String = "Message"

    // explicity about null
    var nullMessage: String? = null
    // implicity about null
    val infereredMessage = null

    // the print (message) will be NULL
    println(nullMessage?.length) // if the value is not null, then invokes the method lengh


    /*    AVOID THIS TUPPLE CHRISTMAS TREE
    if (nullMessage != null) {
        // nullMessage = "Hello"
        println(nullMessage.length)
    }
    // println(message.length)

    val customerJava = CustomerJava() // create a instance of customer Java

    if (customerJava != null) {
        if (customerJava.name != null) {
        }
        println(customerJava.name.length)
    }*/

    val sp = createServiceProvider()
    sp?.createService()?.evaluate() // multuple ifs can resulte in one line
}

private fun createServiceProvider(): ServiceProvider? = ServiceProvider()
