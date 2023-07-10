package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

import org.example.model.Address;
import org.example.model.Company;
import org.example.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Employee.class).addAnnotatedClass(Company.class).buildSessionFactory();
			Session session = sessionFactory.openSession();

			Employee employee1 = new Employee();
			employee1.setEmployeeId(11);
			employee1.setFirstName("ABC1");
			employee1.setLastName("MNC1");
			employee1.setEmail("abc1@email.com");
		    Employee employee2=new Employee();
		    employee2.setEmployeeId(21);
		    employee2.setFirstName("XYZ1");
		    employee2.setLastName("GHF1");
		    employee2.setEmail("xyz1@email.com");
		    Company ibm = new Company();
		
			ibm.setCompanyId(UUID.randomUUID().toString());
			ibm.setCompanyName("IBM India");
			ibm.setCompanyAddress(new Address("Banglore", "Karnataka", "banglore", "54321"));
			employee1.setCompany(ibm);
			employee2.setCompany(ibm);
			session.getTransaction().begin();
			// session.save(ibm);
			
			session.save(employee1);
			session.getTransaction().commit();
			session.getTransaction().begin();
			session.save(employee2);
			session.getTransaction().commit();
			System.out.println("employees created!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
