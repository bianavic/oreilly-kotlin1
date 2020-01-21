package com.hadihariri.kotlincourse.basics

// someUtility is automatically imported from util
// import com.hadihariri.kotlincourse.basics.utils.someUtility as someAdditionFunction

// import when we have some conflict
import com.hadihariri.kotlincourse.basics.utils.someUtility as someAdditionFunction

// import everything
import com.hadihariri.kotlincourse.basics.utils.*

fun main() {
    println("Hello World!")

    someAdditionFunction("Some name")
}