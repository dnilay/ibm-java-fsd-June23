package org.example.service;

import java.util.List;
import java.util.Optional;

import org.example.model.Inventory;

public interface InventoryService {
	
	public Inventory createInventory(Inventory inventory);
	
	public List<Inventory> getAllInventory();
	
	public Inventory getInventoryByid(int inventoryId);

}
