package com.samircode.demo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class Desktop implements Computer {
    public void compile(){
        System.out.println("compile using Desktop");
    }
}
