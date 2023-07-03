package org.example;

public class SalaryCheckException extends Exception {
	
	private String errorMessage;

	public SalaryCheckException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
