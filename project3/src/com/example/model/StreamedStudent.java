package com.example.model;

public class StreamedStudent extends Student {
	private String stream;
	
	
	public StreamedStudent() {
		
	}




	@Override
	public void createStudent(int id, String name, String stream) {
		// TODO Auto-generated method stub
		super.createStudent(id, name, null);
		this.stream=stream;
	}




	public String getStream() {
		return stream;
	}


	public void setStream(String stream) {
		this.stream = stream;
	}


	@Override
	public String getDetails() {
		
		return super.getDetails()+" Stream= "+stream;
	}


	
}
