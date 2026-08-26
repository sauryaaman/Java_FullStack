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
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//          ByName Autowire

//          CarByName carByName=context.getBean("carByName",CarByName.class);
//          carByName.drive();


//        ByType Autowire;


          CarByType carByType= context.getBean("carByType",CarByType.class);

          carByType.drive();


        // constructor se autowire

//       CarByConstructor carByConstructor= context.getBean("carByConstructor",CarByConstructor.class);
//       carByConstructor.drive();


        //Ambuguuity error example for solving by  using the autowire-candiate attribute

//       CarByMultipleEngine carByMultipleEngine= context.getBean("carByMultipleEngine",CarByMultipleEngine.class);
//       carByMultipleEngine.drive();
    }
}
