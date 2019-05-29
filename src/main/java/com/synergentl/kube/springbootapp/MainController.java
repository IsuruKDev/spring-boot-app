package com.synergentl.kube.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(path = "/info")
    public String appRunning(){
        return "Spring-Boot-App is running";
    }
}
