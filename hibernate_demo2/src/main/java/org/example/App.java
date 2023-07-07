package org.example;

import org.example.model.Car;
import org.example.model.MotorCycle;
import org.example.model.RoadVehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(RoadVehicle.class).addAnnotatedClass(Car.class)
					.addAnnotatedClass(MotorCycle.class).buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			  session.getTransaction().begin(); session.save(new RoadVehicle());
			  session.getTransaction().commit();
			 
			session.getTransaction().begin();
			  session.save(new Car());
			  session.save(new MotorCycle());
			  session.getTransaction().commit();
			 
			System.out.println("done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
