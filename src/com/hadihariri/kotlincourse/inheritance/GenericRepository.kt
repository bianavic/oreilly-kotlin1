package com.hadihariri.kotlincourse.inheritance

import java.lang.UnsupportedOperationException

// type parameters CLASS
class GenericRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        throw UnsupportedOperationException("not implemented")
    }
    override fun getAll(): List<T> {
        throw UnsupportedOperationException("not implemented")
    }
}

interface Repo {
    fun<EntityType> getById(id: Int): EntityType
    fun<R> getAll(): List<R> // single letters usually represent TYPE PARAMETERS
}

class MyRepo: Repo {

    // type parameters FUNCTIONS
    override fun <T> getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T> getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

