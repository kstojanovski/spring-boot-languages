package com.acme.spring_boot_languages.controller

import com.acme.spring_boot_languages.pojo.PersonJavaPojo
import com.acme.spring_boot_languages.service.PersonGroovyJavaService
import com.acme.spring_boot_languages.service.PersonGroovyService
import com.acme.spring_boot_languages.service.PersonJavaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SuppressWarnings("unused")
@RequestMapping("/groovy/person")
class PersonGroovyController {

    private PersonGroovyJavaService personGroovyJavaService
    private PersonGroovyService personGroovyService
    private PersonJavaService personJavaService
    private PersonJavaPojo personJavaPojo = new PersonJavaPojo()

    PersonGroovyController(
            PersonGroovyJavaService personGroovyJavaService,
            PersonGroovyService personGroovyService,
            PersonJavaService personJavaService
    ) {
        this.personGroovyJavaService = personGroovyJavaService
        this.personGroovyService = personGroovyService
        this.personJavaService = personJavaService
    }

    @GetMapping("/groovy-service")
    String getGroovyPersonName() {
        return personGroovyService.getPersonName()
    }

    @GetMapping("/groovy-java-service")
    String getGroovyJavaPersonName() {
        return personGroovyJavaService.getFromJavaContext()
    }

    @GetMapping("/java-service")
    String getJavaPersonName() {
        return personJavaService.personName
    }

    @GetMapping("/java-pojo")
    String getJavaPojoPersonName() {
        return personJavaPojo.getPersonName()
    }
}
