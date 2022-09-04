package com.learning.microservice.microservice.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController()
public class MainController {

    @GetMapping()
    public String test() {
        return "SUCCESS :: "+new Timestamp(System.currentTimeMillis());
    }

    @GetMapping("hello")
    public HelloWorld helloWorld() {
        return new HelloWorld("hello world !! I am a record class in Java 17");
    }
}
