package com.synergentl.kube;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
@Slf4j
public class MainController {

    @GetMapping(path = "/info")
    public String appRunning(){
        log.info("app is running...");
        log.warn("app is running...");
        log.error("app is running...");
    //    log.debug("app is running...");
    //    log.trace("app is running...");
        return "Spring-Boot-App is running";
    }
}
