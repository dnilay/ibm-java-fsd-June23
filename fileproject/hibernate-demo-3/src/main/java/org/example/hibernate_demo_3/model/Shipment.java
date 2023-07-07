package org.example.hibernate_demo_3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "shipment_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Shipment {

	@Id
	
	@Column(name = "shipmentO_id")
	private int id;
	@Column(name = "city_name")
	private String city;
	@Column(name = "zipcode")
	private String zipCode;
}
