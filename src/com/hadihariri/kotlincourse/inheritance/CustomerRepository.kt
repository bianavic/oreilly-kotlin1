    package com.hadihariri.kotlincourse.inheritance

    // interface is a contract
    // kotlin = interfaces can have default IMPLEMENTATION, METHODS
    // u cannot MAINTAIN STATE, but they can have PROPERTIES, abstract properties.
    interface CustomerRepository {
        val isEmply: Boolean
            // u can have getters and setters
            get() = true
        fun store(obj: Customer) {

        }
        fun getById(id: Int): Customer
    }

    class SQLCustomerRepository: CustomerRepository {
        override fun getById(id: Int): Customer {
            return Customer()
        }

        override fun store(obj: Customer) {
            super.store(obj)
        }

        override val isEmply: Boolean
            get() = false
    }

        interface Interface1 {
            fun funA() {
                println("Fun A from interface 1")
            }
        }

        interface Interface2 {
            fun funA() {
                println("Fun A from interface 2")
                }
            }

    class Class1And2: Interface1, Interface2 {
        override fun funA() {
            // function of the interface we want to call
            super<Interface1>.funA()
        }
    }

        fun main(args: Array<String>) {
            val c = Class1And2()
            c.funA()
        }