package org.example.service;

import org.example.factory.MyHibernateFactory;
import org.example.model.Inventory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class InventoryServiceImpl implements InventoryService {

	private SessionFactory sessionFactory;
	
	private Session session=null;
	{
		sessionFactory=MyHibernateFactory.getSessionFactory();
		
	}
	@Override
	public Inventory createInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(inventory);
		session.getTransaction().commit();
		return inventory;
	}

}
