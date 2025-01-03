package com.samircode.demo.model;

import org.springframework.stereotype.Component;

@Component
 public class Laptop implements Computer {
    public void compile(){
        System.out.println("compile usiing Laptop");
    }
}
