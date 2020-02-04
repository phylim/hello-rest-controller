package com.mckesson.controllers;

import com.mckesson.entities.Person;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public Person hello(
            @RequestParam String name,
            @RequestParam Date birthDate,
            @RequestParam String email){
        return new Person(name, birthDate, email);
    }

    @PostMapping("/hello-person")
    public Person helloPerson(@RequestBody Person person){
        return person;
    }
}