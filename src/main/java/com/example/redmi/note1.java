package com.example.redmi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class note1 {

    @GetMapping("/mynote1")

    public String getData(){

        return " This is very nice mobile series launched by redmi ";
    }
}
