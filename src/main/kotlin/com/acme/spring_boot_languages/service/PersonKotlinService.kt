package com.acme.spring_boot_languages.service

import org.springframework.stereotype.Service

@Service
internal class PersonKotlinService {

    fun getPersonName(): String {
        return "${this::class.java.simpleName} name"
    }
}