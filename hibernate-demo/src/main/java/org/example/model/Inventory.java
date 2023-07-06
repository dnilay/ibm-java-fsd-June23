package org.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "inventory")
@Entity
public class Inventory {
	@Id
	@Column(name = "inventory_id")
	private int inventId;
	@Column(name = "product_id")
	private int productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "aavailable")
	private int available;

}
