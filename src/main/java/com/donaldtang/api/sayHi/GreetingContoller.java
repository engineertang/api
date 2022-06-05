package com.donaldtang.api.sayHi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/", produces = "application/json")
public class GreetingContoller {

    @GetMapping(path = "/greet")
    public String sayHi(){
        return "Hello World";
    }

}
