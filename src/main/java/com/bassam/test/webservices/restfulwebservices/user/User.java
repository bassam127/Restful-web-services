package com.bassam.test.webservices.restfulwebservices.user;

import java.time.LocalDate;

public class User {

	private Integer id;
	private String name;
	private LocalDate birthDate;

	protected User(){
		
	}
	public User(int id, String name, LocalDate localDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = localDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
