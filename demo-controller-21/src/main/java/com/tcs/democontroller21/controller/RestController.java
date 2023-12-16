package com.tcs.democontroller21.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("test")
public class RestController {
    @GetMapping("/string")
    public String demoStringUtils(){

        return "";
    }
}
