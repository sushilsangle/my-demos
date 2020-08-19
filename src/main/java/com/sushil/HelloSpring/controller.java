package com.sushil.HelloSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/info")
    public String getInfo()
    {
        return "Welcome to Spring Boot world....";

    }

}
