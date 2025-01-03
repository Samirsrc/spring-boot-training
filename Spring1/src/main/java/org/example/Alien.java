package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    @Value("26")
    int age;

    Computer comp;

    @ConstructorProperties({"age", "lap"})
    public Alien(int age, Computer comp) {
        this.age = age;
        this.comp = comp;
    }

    public Alien() {
        System.out.println("object created");
    }

    public void code() {
        System.out.println("Coding");
        comp.compile();

    }

    public Computer getComp() {
        return comp;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
