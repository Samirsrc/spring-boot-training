package com.samircode.demo;

import com.samircode.demo.model.Alien;
import com.samircode.demo.model.Laptop;
import com.samircode.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);

        LaptopService service = context.getBean(LaptopService.class);

        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);








//        Alien obj1 = context.getBean(Alien.class);
//        System.out.println(obj1.getAge());
//        obj1.code();



    }

}
