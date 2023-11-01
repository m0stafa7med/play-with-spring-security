package com.mostafa.playwithsecurity.controller;

import com.mostafa.playwithsecurity.security.Demo4ConditionEvaluator;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo1")
    @PreAuthorize("hasAuthority('read')")
    public String demo() {
        return "demo1";
    }

    @GetMapping("/demo2")
    @PreAuthorize("hasAnyAuthority('read','write')")
    public String demo2() {
        return "demo2";
    }

    
    @GetMapping("/demo3/{smth}")
    @PreAuthorize("#something == authentication.name")
    public String demo3(@PathVariable("smth") String something) {
        return "demo3";
    }



    @GetMapping("/demo4/{smth}")
    @PreAuthorize("@demo4ConditionEvaluator.condition(#something)")
    public String demo4(@PathVariable("smth") String something) {
        return "demo4";
    }


}
