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

        System.out.println("before context");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("before get bean and after context");
        Alien obj1 = (Alien) context.getBean("alien");
        System.out.println("after get bean");
        obj1.code();

    }
}
