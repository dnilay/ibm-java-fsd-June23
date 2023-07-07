package org.example.hibernate_demo_3;

import java.util.Random;
import java.util.UUID;

import org.example.hibernate_demo_3.model.Order;
import org.example.hibernate_demo_3.model.Shipment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Order.class).addAnnotatedClass(Shipment.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Shipment shipment = new Shipment();
		shipment.setCity("Banglore");
		shipment.setZipCode("600564");
		shipment.setId(new Random().nextInt(1000));
		Order order = new Order();
		order.setId("odr1");
		order.setOrderName("Laptop");
		order.setShipment(shipment);
		shipment.setOrder(order);
		session.getTransaction().begin();

	//	session.save(shipment);
		session.save(order);

		
		session.getTransaction().commit();
		System.out.println("done");
	}
}
