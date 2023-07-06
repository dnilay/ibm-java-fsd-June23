package org.example.factory;

import org.example.model.Inventory;
import org.example.model.Product;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyHibernateFactory {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Inventory.class).addAnnotatedClass(Product.class).buildSessionFactory();
		return sessionFactory;
	}

}
