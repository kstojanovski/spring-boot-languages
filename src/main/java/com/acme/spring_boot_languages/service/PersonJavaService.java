package com.acme.spring_boot_languages.service;

import com.acme.spring_boot_languages.pojo.PersonJavaPojo;
import org.springframework.stereotype.Service;

@Service
public class PersonJavaService {

    public String getPersonName() {
        return this.getClass().getSimpleName() + " " + new PersonJavaPojo().getPersonName();
    }
}
