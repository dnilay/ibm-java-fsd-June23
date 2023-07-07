package org.example.hibernate_demo_3.model;

import javax.persistence.Entity;

import lombok.Setter;

@Setter
@Entity
public class SpecialEditionCD extends CD {

	public SpecialEditionCD(String cdName, String feature) {
		super(cdName);
		// TODO Auto-generated constructor stub
		this.feature = feature;
	}

	private String feature;

}
