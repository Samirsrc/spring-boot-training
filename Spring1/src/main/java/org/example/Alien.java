package org.example;

import java.beans.ConstructorProperties;

public class Alien {
int age;
Computer comp;
@ConstructorProperties({"age","lap"})
   public Alien(int age, Computer comp) {
       this.age = age;
        this.comp = comp;
    }

    public Alien(){
        System.out.println("object created");
    }
    public void code(){
        System.out.println("Coding");
        comp.compile();

    }

    public Computer getComp() {
        return comp;
    }

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
