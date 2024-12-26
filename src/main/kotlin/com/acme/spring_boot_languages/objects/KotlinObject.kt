package com.acme.spring_boot_languages.objects

object KotlinObject {

    fun getValue(): String {
        return this.javaClass::class.java.javaClass.simpleName + " KotlinObject value";
    }
}