package org.example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@DiscriminatorValue("MOTOR_CYCLE")
public class MotorCycle extends RoadVehicle {
	@Enumerated(EnumType.STRING)
	public final AcclerationType acclerationType=AcclerationType.THROTTLE;
	
	public MotorCycle()
	{
		super();
		numWheels=2;
		numPassengers=2;
		make="Bajaj";
		model="Avenger";
	}

}
