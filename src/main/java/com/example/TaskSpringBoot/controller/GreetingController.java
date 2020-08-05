package com.example.TaskSpringBoot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(@RequestParam(name = "input") String s) {
        StringBuilder stringBuilder = new StringBuilder();
           stringBuilder.append(s);
        return "index  " + stringBuilder.reverse();
    }

    @GetMapping("/greetHello")
    public String greetHello() {
        return "Hello, How are you?";
    }

}
