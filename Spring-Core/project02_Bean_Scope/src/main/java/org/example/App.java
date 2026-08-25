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


        System.out.println("Singletoon Scope example");
        Student singletonstudent1=context.getBean("singletonStudent",Student.class);
        Student singletonstudent2=context.getBean("singletonStudent",Student.class);

        singletonstudent1.setName("Aman");
//        singletonstudent2.setName("saurya");
//        singletonstudent1.showDetails();
        singletonstudent2.showDetails();
        System.out.println(singletonstudent1==singletonstudent2);
        //both name is same Aman in also Singletonstduent2




        //prototype scope

        System.out.println("Prototype SCope");


        Student prototypestudent1=context.getBean("protptypeStudent",Student.class);
        Student prototypestudent2=context.getBean("protptypeStudent",Student.class);

        prototypestudent1.setName("Kajal");
        prototypestudent2.setName("kumari");
         prototypestudent1.showDetails();
         prototypestudent2.showDetails();
        System.out.println(prototypestudent1==prototypestudent2);  //here both  are the  different object crated show   both name are different
    }
}
