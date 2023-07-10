package org.example.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
	@Id
	private String companyId;
	@Column(name = "company_name")
	private String companyName;
	@Embedded
	private Address companyAddress;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "company")
//	@JoinColumn(name = "company_id")
	private Collection<Employee> employees;

}
