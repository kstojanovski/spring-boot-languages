package com.acme.spring_boot_languages.pojo

class PersonGroovyPojo {

    static String concatName(String name) {
        def test = "test"
        return name + JavaConstants.CONSTANT.concat(test) + " " + new PersonJavaPojo(test).getPersonName(test)
    }

}
