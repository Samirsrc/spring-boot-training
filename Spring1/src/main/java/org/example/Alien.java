package org.example;

import java.beans.ConstructorProperties;

public class Alien {
int age;
Laptop lap;
@ConstructorProperties({"age","lap"})
   public Alien(int age, Laptop lap) {
       this.age = age;
        this.lap = lap;
    }

    Alien(){
        System.out.println("object created");
    }
    public void code(){
        System.out.println("Coding");
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
