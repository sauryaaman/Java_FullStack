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
      //object created


        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");


        Car car = (Car) context.getBean("car");
         car.drive();


    }
}
