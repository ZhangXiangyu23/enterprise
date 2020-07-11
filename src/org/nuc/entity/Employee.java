package org.nuc.entity;

public class Employee {
	private int id;
	private String password;
	private String name;
	private String sex;
	private String contect;
	private String identity;
	private String education;
	private String address;
	private String type;
	
	public Employee(String password, String name, String sex, String contect, String identity, String education,
			String address, String type) {
		super();
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.contect = contect;
		this.identity = identity;
		this.education = education;
		this.address = address;
		this.type = type;
	}
	public Employee() {
		super();
	}
	public Employee(int id, String name, String sex, String contect, String identity, String education,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.contect = contect;
		this.identity = identity;
		this.education = education;
		this.address = address;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getContect() {
		return contect;
	}
	public void setContect(String contect) {
		this.contect = contect;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", password=" + password + ", name=" + name + ", sex=" + sex + ", contect="
				+ contect + ", identity=" + identity + ", education=" + education + ", address=" + address + ", type="
				+ type + "]";
	}
	
	
}
