package org.example.Config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean ({"Desk","PC fix"})
    public Desktop desktop(){
        System.out.println("wow");
        return new Desktop();
    }
}
