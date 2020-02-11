    package com.hadihariri.kotlincourse.classes

    //  create Global OBJECT
    // This is a SINGLETON PATTERN = create a class which only allows a single instance
    object Global {
        val PI = 3.14

    }

    fun main(args: Array<String>) {

        // local object
        val localObject = object {
            val PI = 3.14159

        }
        println(localObject.PI)
        println(Global.PI)

    }