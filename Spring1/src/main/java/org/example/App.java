package org.example;

import org.example.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop desk = context.getBean("PC fix",Desktop.class);
        desk.compile();

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien obj1 = (Alien) context.getBean("alien", Alien.class);
//
//        obj1.code();
//        System.out.println(obj1.age);
//        obj1.code();
//
//        Alien obj2=(Alien) context.getBean("alien");
//        obj2.code();
//        System.out.println(obj2.age);


    }
}
