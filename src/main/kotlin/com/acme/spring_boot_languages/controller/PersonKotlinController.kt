package com.acme.spring_boot_languages.controller

import com.acme.spring_boot_languages.pojo.PersonJavaPojo
import com.acme.spring_boot_languages.service.PersonJavaService
import com.acme.spring_boot_languages.service.PersonKotlinService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/kotlin/person")
internal class PersonKotlinController(
    private val personKotlinService: PersonKotlinService,
    private val personJavaService: PersonJavaService
) {
    private val personJavaPojo = PersonJavaPojo()

    @GetMapping("kotlin-service")
    fun  getPersonData(): String {
        return personKotlinService.getPersonName();
    }

    @GetMapping("java-service")
    fun getJavaPersonData(): String {
        return personJavaService.personName
    }

    @GetMapping("java-pojo")
    fun  getJavaPojoPersonData(): String {
        return personJavaPojo.personName
    }

}