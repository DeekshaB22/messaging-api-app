package com.training.messagingapiapp.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class msgController {

    @GetMapping("oll")
    public String printGreetings(){
        return "Hi Oracle!!";
    }

    @GetMapping()         //http://localhost:9090/softbank/api/accounts/hi
    public String print(){
        return "Hello Guest";
    }
}
