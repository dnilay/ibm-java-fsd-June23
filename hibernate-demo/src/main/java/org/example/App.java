package org.example;

import org.example.model.Inventory;
import org.example.service.InventoryService;
import org.example.service.InventoryServiceImpl;
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
    	  
InventoryService service=new InventoryServiceImpl();
Inventory i=service.createInventory(new Inventory(301, 101, "Laptop", 10));
System.out.println(i);

		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    }
}
