package com.natraj.Springboot.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//we want to serve the end point which means whenever we hit that endpoint we want this particular method
    //to be executed
    //whenever we enter localhost:8080/ below method will be called it is get method whenever we hit this
    //endpoint / this string will be returned
   // @RequestMapping(value = "/", method = RequestMethod.GET) we can replace this request mapping with
    @GetMapping("/") //
    // pping request mapping will be present it will make our work easy
    public String helloworld(){
        return "welcome to my pageee!!!";
    }

}
