package com.hadihariri.kotlincourse.classes

/*enum class Priority {
    MINOR,
    NORMAL,
    MAJOR,
    CRITICAL
}*/

/*enum class Priority(val value: Int) { // create a value property
    MINOR(-1),
    NORMAL(0),
    MAJOR(1),
    CRITICAL(10)
}*/

enum class Priority(val value: Int) { // create a value property
    MINOR(-1) {

        override fun text(): String {
            return "[MINOR PRIORITY]"//To change body of created functions use File | Settings | File Templates.
        }

        override fun toString(): String {
            return "Minor Priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    MAJOR(1) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
    ,
    CRITICAL(10) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }; // SEMICOLON

    // create our own fun that overrite to string
    // no we use ;
    // for each we need to IMPLEMENT Members
    abstract fun text(): String
}

fun main(args: Array<String>) {

    val priority = Priority.MINOR
    println(priority)
    println(priority.text())

/*    val priority = Priority.NORMAL

    println(priority)
    println(priority.value)
    // println(priority.ordinal)
    println(Priority.CRITICAL.ordinal)
    println(Priority.CRITICAL.name)*/

/*    for (priorityInList in Priority.values()) {
        println(priorityInList)
    }

    val p = Priority.valueOf("MAJOR")
    println(p.ordinal)*/

}