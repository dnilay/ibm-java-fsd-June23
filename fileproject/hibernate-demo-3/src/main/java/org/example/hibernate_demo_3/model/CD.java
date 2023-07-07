package org.example.hibernate_demo_3.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CD {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cdId;
	private String cdName;
	public CD(String cdName) {
		super();
		this.cdName = cdName;
	}
	

	
}
