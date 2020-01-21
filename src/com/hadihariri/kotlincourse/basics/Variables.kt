package com.hadihariri.kotlincourse.basics

// declare variables
fun main(args: Array<String>) {
    // i dont need to constantly put the type (Int, String)
   var streetNumber = 10
    var streetName = "Avenida Faria Lima"// the compiler infers that this is of type String

    // a var that is IMMUTABLE === val
    val zip = "E11 P1"

    streetName = "Arouche"

    // OBJECT in Kotlin
    // val myInt: Int // val myNumber: BYTE, LONG, FLOAT, DOUBLE

    // need the characters (L, F, x0F, xb01) to know these specific types
    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01

    // we dont have a conversion

    val myInt = 100
    // val myLongAgain = myInt ===> this is a Interger
    // there is no implicit conversions in Kotlin,  has to be EXPLICIT ===> .toLong()
    val myLongAgain: Long = myInt.toLong() // HELPER FUNCTIONS that allow conversions

    // String
    val myChar = 'A'
    val myString = "My String"

    val escapeCharacters = "A new Line \n"

    val rawString = "Hello" +
            "This is a second line" +
            "This is a third line"

    val multipleLines = """
        This is a string
        This is another string
        """

    // string $interpolation
    val years = 10
    val message = "A decade is $years years"

    // evoke methodos
    val name = "Mary"
    // So we know that a string has a length function which returns the function-- which
    // returns the length of the function, which returns the length of the name.
    // use that directly in the string interpolation by using the curly braces
    val anotherMessage = "Lehgth of my name is ${name.length} "

}