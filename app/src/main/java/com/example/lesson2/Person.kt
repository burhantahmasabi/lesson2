package com.example.lesson2

open class Person(var name: String, var age: Int) {
    
    override fun toString(): String {
        if (isOld()) return name + " " +  age + " is old"
        else return name + " " + age + " is young"
    }

    fun isOld(): Boolean {
        if (age > 50)
            return true else return false
    }


}