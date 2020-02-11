package com.hadihariri.kotlincourse.inheritance

import java.lang.UnsupportedOperationException

abstract class StoredEntity {
    val isActive = true
    abstract fun store()
    fun status() : String {
        return isActive.toString()
    }
}

class Employee: StoredEntity() {
    override fun store() {
        throw UnsupportedOperationException("not implemented")
    }

}

fun main(args: Array<String>) {
    val se = Employee()
    se.isActive
    se.status()
}