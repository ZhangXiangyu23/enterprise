package org.nuc.entity;

public class User {
	private int id;
	private String password;
	private String type;
	private String name;
	public User() {
		super();
	}
	public User(int id, String password ,String type) {
		super();
		this.id = id;
		this.password = password;
		this.type = type;
	}
	
	public User(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
