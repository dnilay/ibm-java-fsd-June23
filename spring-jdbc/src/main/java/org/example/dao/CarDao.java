package org.example.dao;

import java.sql.SQLException;
import java.util.List;

import org.example.model.Car;

public interface CarDao {
	
	public Car createCar(Car car)throws SQLException;
	public List<Car> getAllCars()throws SQLException;

}
