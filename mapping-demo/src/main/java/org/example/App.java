package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.example.model.Course;
import org.example.model.Student;
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
					.addAnnotatedClass(Student.class).addAnnotatedClass(Course.class).buildSessionFactory();
			Session session = sessionFactory.openSession();

			/*
			 * Employee employee1 = new Employee(); employee1.setEmployeeId(11);
			 * employee1.setFirstName("ABC1"); employee1.setLastName("MNC1");
			 * employee1.setEmail("abc1@email.com"); Employee employee2=new Employee();
			 * employee2.setEmployeeId(21); employee2.setFirstName("XYZ1");
			 * employee2.setLastName("GHF1"); employee2.setEmail("xyz1@email.com"); Company
			 * ibm = new Company();
			 * 
			 * ibm.setCompanyId(UUID.randomUUID().toString());
			 * ibm.setCompanyName("IBM India"); ibm.setCompanyAddress(new
			 * Address("Banglore", "Karnataka", "banglore", "54321"));
			 * employee1.setCompany(ibm); employee2.setCompany(ibm);
			 * session.getTransaction().begin(); // session.save(ibm);
			 * 
			 * session.save(employee1); session.getTransaction().commit();
			 * session.getTransaction().begin(); session.save(employee2);
			 * session.getTransaction().commit(); System.out.println("employees created!");
			 */

			Course course1 = new Course();
			course1.setCourseName("React");
			Course course2 = new Course();
			course2.setCourseName("Jenkins");
			Student student1 = new Student();
			student1.setName("Rahul");
			Student student2 = new Student();
			student2.setName("Brian");
			List<Course> courses = new ArrayList<Course>();
			courses.add(course1);
			courses.add(course2);
			Collection<Student> students=new ArrayList<Student>();
			students.add(student1);
			students.add(student2);
			course1.setStudents(students);
			 student1.setCourses(courses);
			student2.setCourses(courses);
			session.getTransaction().begin();
			session.save(student1);
			session.save(student2);
			session.getTransaction().commit();
			System.out.println("done");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
