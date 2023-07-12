package org.example.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.example.model")
@PropertySource("classpath:config.properties")
public class SpringConfig {

	@Bean
	public Employee employee()
	{
		return new Employee(department());
	}
	
	@Bean
	public Department department()
	{
		return new Department(location());
	}
	@Bean
	public Location location()
	{
		return new Location();
	}
}
