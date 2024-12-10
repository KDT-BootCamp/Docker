package com.devops.study.devopsdemo.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/devops")
public class DevopsCtrl {
    
    @GetMapping("/greeting")
    public String getMethodName(@RequestParam String param) {

        System.out.println("debug >>> endpoint : " + "//api/v1/devops/greeting");

        return "";
    }
    
    
}
