package org.example.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s")
//@Scope(scopeName = "prototype")
@PropertySource(value = "classpath:config.properties")
public class Student {

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Value("${student.name}")
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@PostConstruct
	public void initStudent()
	{
		System.out.println("init method called...");
	}
	
	@PreDestroy
	public void destroyStudent()
	{
		System.out.println("destroy method called...");
	}
}
