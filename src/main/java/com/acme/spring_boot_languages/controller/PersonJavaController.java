package com.acme.spring_boot_languages.controller;

import com.acme.spring_boot_languages.pojo.KotlinConstants;
import com.acme.spring_boot_languages.objects.KotlinObject;
import com.acme.spring_boot_languages.service.PersonJavaService;
import com.acme.spring_boot_languages.service.PersonKotlinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.acme.spring_boot_languages.function.FunctionsKt.addString;
import static com.acme.spring_boot_languages.function.FunctionsKt.joinIntegerList;

@RestController
@SuppressWarnings("unused")
@RequestMapping("/java/person")
class PersonJavaController {

    private final PersonJavaService personJavaService;
    private final PersonKotlinService personKotlinService;
    private final KotlinConstants kotlinConstants = new KotlinConstants();

    public PersonJavaController(
            PersonKotlinService personKotlinService,
            PersonJavaService personJavaService) {
        this.personKotlinService = personKotlinService;
        this.personJavaService = personJavaService;
    }

    @GetMapping("/java-service")
    String getJavaPersonName() {
        return personJavaService.getPersonName();
    }

    @GetMapping("/kotlin-service")
    String getKotlinPersonName() {
        return personKotlinService.getPersonName();
    }

    @GetMapping("/kotlin-pojo")
    String getPersonName() {
        return kotlinConstants.getJavaConstant().concat(addString("someString"));
    }

    @GetMapping("/kotlin-function")
    String getPersonName2() {
        return joinIntegerList(List.of(1,2,3,4,5));
    }

    @GetMapping("/kotlin-object")
    String getKotlinObjectValue() {
        return KotlinObject.INSTANCE.getValue();
    }
}
