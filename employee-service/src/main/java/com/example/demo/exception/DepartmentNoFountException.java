package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class DepartmentNoFountException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String messaage;
	private int statusCode;
	private long errorReportringTime;
	public DepartmentNoFountException(String messaage) {
		super();
		this.messaage = messaage;
	}
	

}
