package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj1 = (Alien) context.getBean("alien", Alien.class);
        
        obj1.code();
        System.out.println(obj1.age);
        obj1.code();

        Alien obj2=(Alien) context.getBean("alien");
        obj2.code();
        System.out.println(obj2.age);


    }
}
