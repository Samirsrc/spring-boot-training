package org.example.Config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean ({"Desk","PC fix"})
    //@Scope ("prototype")
    public Desktop desktop(){
        System.out.println("wow");
        return new Desktop();
    }
@Primary
    @Bean ({"Lap","Portable"})
    //@Scope ("prototype")
    public Laptop laptop(){
        System.out.println("waw");
        return new Laptop();
    }
    @Bean
    public Alien alien(@Qualifier("Desk") Computer comp){
        System.out.println("Alien bean created");
        Alien obj = new Alien();
        obj.setAge(26);
        obj.setComp(comp);

        return obj;

    }
}
