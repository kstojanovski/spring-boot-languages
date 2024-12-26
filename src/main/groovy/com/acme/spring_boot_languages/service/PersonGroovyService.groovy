package com.acme.spring_boot_languages.service


import org.springframework.stereotype.Service

@Service
class PersonGroovyService {

    String getPersonName() {
        return this.class.simpleName + " person mame"
    }
}
