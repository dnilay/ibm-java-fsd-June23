package org.example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@DiscriminatorValue("MOTOR_CYCLE")
@Table(name = "motorcycle_table")
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
