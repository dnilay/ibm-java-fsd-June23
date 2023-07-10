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
public class App 
{
    public static void main( String[] args )
    {
        try {
        	SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).
        			addAnnotatedClass(Company.class).buildSessionFactory();
        	Session session=sessionFactory.openSession();
        	Employee employee1=new Employee(new Random().nextInt(10000), "John", "Doe", "john@email.com");
        	Employee employee2=new Employee(new Random().nextInt(10000), "Marry", "Public", "marry@email.com");
        	Employee employee3=new Employee(new Random().nextInt(10000), "Rahul", "Dravid", "rahul@email.com");
			Company ibm=new Company();
			ArrayList<Employee> list=new ArrayList<Employee>();
			list.add(employee1);
			list.add(employee2);
			list.add(employee3);
			ibm.setCompanyId(UUID.randomUUID().toString());
			ibm.setCompanyName("IBM India");
			ibm.setCompanyAddress(new Address("Banglore", "Karnataka", "banglore", "54321"));
			ibm.setEmployees(list);
			session.getTransaction().begin();
			session.save(ibm);
			session.getTransaction().commit();
			System.out.println("company created...!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
