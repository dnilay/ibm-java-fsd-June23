package org.example;

import java.util.List;

import org.example.model.Inventory;
import org.example.service.InventoryService;
import org.example.service.InventoryServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
      try {
    	  
			
	InventoryService service=new InventoryServiceImpl(); 
/*	Inventory i=service.createInventory(new Inventory(301, 101, "Laptop", 10));
			 * System.out.println(i);
			 */
    	  
/*
 * List<Inventory> i=service.getAllInventory(); for(Inventory ii:i) {
 * System.out.println(i); }
 */
	
	Inventory i=service.getInventoryByid(100);
	if(i==null)
	{
		System.out.println("no such id found...");
	}
	else
	{
		System.out.println(i);
	}

		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    }
}
