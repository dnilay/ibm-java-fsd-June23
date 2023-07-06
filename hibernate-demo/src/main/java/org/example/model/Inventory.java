package org.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "inventory")
@Entity
@ToString
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
	public Inventory(int productId, String productName, int available) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.available = available;
	}

}
