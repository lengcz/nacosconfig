package com.it2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${person.name}")
    private String name;

    @Autowired
    ConfigurableApplicationContext applicationContext;


    @GetMapping("/hello")
    public String hello(){
        System.out.println("=====================");
//        System.out.println(applicationContext.getEnvironment().getProperty("config01.name"));
//        System.out.println(applicationContext.getEnvironment().getProperty("config02.name"));
//        System.out.println(applicationContext.getEnvironment().getProperty("config03.name"));
        System.out.println(applicationContext.getEnvironment().getProperty("name"));
        return name;
    }
}
