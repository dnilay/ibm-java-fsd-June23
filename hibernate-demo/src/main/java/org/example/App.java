package org.example;

import org.example.model.Inventory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      try {
    	  
    	  SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").
    			  addAnnotatedClass(Inventory.class).buildSessionFactory();
    	  Session session=sessionFactory.openSession();
    	  session.getTransaction().begin();
    	  session.save(new Inventory(101, 11, "Pencil", 90));
    	  session.getTransaction().commit();
    	  System.out.println("One Item Saved...");
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    }
}
