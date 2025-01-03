package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Desktop implements Computer{
    public void compile(){
        System.out.println("Compiling using desktop");
    }
}
