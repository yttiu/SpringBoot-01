package com.hnkj.springboot_01.contraller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContraller {
    @GetMapping("/hello")
    public String HELLO () {
        System.out.println("Hello Spring Boot2!!!");
        return "Hello Spring Boot！";
    }
}
