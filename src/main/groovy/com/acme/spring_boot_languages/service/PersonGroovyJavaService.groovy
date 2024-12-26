package com.acme.spring_boot_languages.service

import com.acme.spring_boot_languages.pojo.JavaConstants
import com.acme.spring_boot_languages.pojo.PersonJavaPojo
import org.springframework.stereotype.Service

@Service
class PersonGroovyJavaService {

    private PersonJavaService personService;

    PersonGroovyJavaService(PersonJavaService personService) {
        this.personService = personService;
    }

    String getFromJavaContext() {
        return JavaConstants.CONSTANT +
                " " + new PersonJavaPojo().getPersonName() + " " + personService.personName +
                new PersonJavaPojo().getPersonName()
    }
}
