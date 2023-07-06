package org.example.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.TypedQuery;

import org.example.factory.MyHibernateFactory;
import org.example.model.Inventory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class InventoryServiceImpl implements InventoryService {

	private SessionFactory sessionFactory;

	private Session session = null;
	{
		sessionFactory = MyHibernateFactory.getSessionFactory();

	}

	@Override
	public Inventory createInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(inventory);
		session.getTransaction().commit();
		return inventory;
	}

	@Override
	public List<Inventory> getAllInventory() {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		TypedQuery<Inventory> query = session.createQuery("FROM Inventory I", Inventory.class);
		List<Inventory> list = query.getResultList();
		return list;
	}

	@Override
	public Inventory getInventoryByid(int inventoryId) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		Inventory i= session.find(Inventory.class, inventoryId);
		return i;
	}

}
