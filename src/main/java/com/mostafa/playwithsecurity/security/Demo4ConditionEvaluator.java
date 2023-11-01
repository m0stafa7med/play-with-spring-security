package com.mostafa.playwithsecurity.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Demo4ConditionEvaluator {

    public boolean condition(String name) {
        Authentication a = SecurityContextHolder.getContext().getAuthentication();
        return Objects.equals(a.getName(), name);
        //   return true; // complex conditions
    }
}
