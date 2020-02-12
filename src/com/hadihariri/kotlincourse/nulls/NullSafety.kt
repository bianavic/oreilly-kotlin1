package com.hadihariri.kotlincourse.nulls

import com.hadihariri.kotlincourse.classes.CustomerJava

fun main(args: Array<String>) {

    val message: String = "Message"

    var nullMessage: String? = null
    val infereredMessage = null

    // this result is usually expected with interoperability
    println(nullMessage!!.length) // quotation mark says "stop complaining about KotlinNullPointerException"

}

