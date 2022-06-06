package com.zsy.springbootstudy.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controler {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello, World!";
    }
}
