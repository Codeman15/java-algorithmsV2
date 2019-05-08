package com.makersacademy.acebook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.makersacademy.acebook.model.Timer.collectionTimer;

@RestController
public class ApiController {

    @RequestMapping(value = "/api")                         //going to the api endpoint
    public String api() {
        return collectionTimer();
    }       //calling to the collectionTimer method in timer file

}

//have 2 seperate contollers because this one is returning JSON and the other is returning html