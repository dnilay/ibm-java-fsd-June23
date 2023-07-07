package org.example.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "RoadVehicleSingle")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "road_vehicle_table")
@DiscriminatorColumn(name = "VEHICLE_TYPE", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("ROAD_VEHICLE")
@Setter
@Getter

public class RoadVehicle {
	public enum AcclerationType {
		PADDLE, THROTTLE
	};

	@Id
	@Column(name = "vehicle_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	@Column(name = "number_of_passengers")
	protected int numPassengers;
	@Column(name = "number_of_wheels")
	protected int numWheels;
	@Column(name = "making_company")
	protected String make;
	@Column(name = "model_name")
	protected String model;

	public RoadVehicle() {
		super();
		
	}

	

}
