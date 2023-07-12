package org.example;

import java.util.List;

import org.example.config.SpringConfig;
import org.example.dao.CarDao;
import org.example.model.Car;
import org.example.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {

			ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
			CarService carService = context.getBean("carService", CarService.class);
			/*
			 * Car c = carDao.createCar(new Car(105, "mahindra scorpio"));
			 * System.out.println(c);
			 */
			
			List<Car> cars=carService.getAllCars();
			for(Car c:cars)
			{
				System.out.println(c);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
