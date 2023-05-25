package com.example.redmi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class redmi9 {

    @GetMapping("/myredmi9")

    public String getData(){

        return " redmi9 is the new version of redmi brand";
    }
}
