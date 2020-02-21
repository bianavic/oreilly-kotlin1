package com.hadihariri.kotlincourse.functional

// there r 3 fun. and i declare a fun op that takes 2 parameters (2 intergers) and returns 1 interger
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int { // high order function
    return op(x, y)

}

fun operation(x: Int, op: (Int) -> Unit) {}

fun route(path: String, vararg actions: (String, String) -> String) {}

fun unaryOperation(x: Int, op: (Int) -> Int) {}

// use that creating a fun that uses 'op fun
fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {

    // lets call
    // we are passing the function sum to the function operation
    print( operation(1, 2, ::sum)) // reference a function by name with :: plus the name of the function
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    operation(1, 2, sumLambda)

    unaryOperation(2, { x -> x * x }) // correct
    unaryOperation(3, { it * it}) // correct
    unaryOperation(3) { it * it}

    // anonymous function
    unaryOperation(3, fun(x: Int): Int { return x * x })


}