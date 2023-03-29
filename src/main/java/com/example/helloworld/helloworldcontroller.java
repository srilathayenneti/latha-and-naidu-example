package com.example.helloworld;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class helloworldcontroller{

    @GetMapping("/")
    public String HelloText(){
        return "hi hello world";
    }

     @GetMapping("/naidu")
    public String HelloText1(){
        return "hi hello naidu";
    }
}