package org.example.service;

import java.sql.SQLException;
import java.util.List;

import org.example.model.Car;

public interface CarService {
	public Car createCar(Car car)throws SQLException;
	public List<Car> getAllCars()throws SQLException;

}
