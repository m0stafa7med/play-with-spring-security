package com.mostafa.playwithsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
    @GetMapping("/demo")
    public String test()
    {
        return "demo!";
    }

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello";
    }
}
