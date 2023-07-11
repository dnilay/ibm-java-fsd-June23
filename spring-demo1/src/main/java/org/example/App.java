package org.example;

import org.example.model.Car;
import org.example.model.Coach;
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
        try {
        	
        	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach myCoach=context.getBean("theCoach",Coach.class);
			System.out.println(myCoach.getDailyWorkOut());
        	Car car=context.getBean("c",Car.class);
        	System.out.println(car.getDetails());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    }
}
