package com.bassam.test.webservices.restfulwebservices.halloworld;

public class HalloWorldBean  {
	
	private String message;
	
	public HalloWorldBean(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		
		return String.format("HalloWorldBean [message=%s]", message);
	}

}
