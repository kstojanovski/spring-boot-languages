package com.acme.spring_boot_languages.function

internal fun addString(string: String): String {
    return "$string ending"
}

internal fun joinIntegerList(integers: List<Int>): String = "function joinIntegerList " + integers.joinToString()
