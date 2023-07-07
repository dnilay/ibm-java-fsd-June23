package org.example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.ToString;

@Entity
@DiscriminatorValue("CAR")
@ToString
public class Car extends RoadVehicle {

	@Enumerated(EnumType.STRING)
	public final AcclerationType acclerationType=AcclerationType.PADDLE;
	
	
	public Car()
	{
		super();
		numWheels=4;
		numPassengers=5;
		make="Maruti";
		model="Baleno";
	}
	
	
	
}
