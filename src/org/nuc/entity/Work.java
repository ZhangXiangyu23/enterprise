package org.nuc.entity;

public class Work {
	private int id;
	private float attendance;
	private String explains;
	private int late;
	private int business;
	private int overtime;
	private int salary;
	public Work() {
		super();
	}
	public Work(int id, float attendance, String explains, int late, int business, int overtime, int salary) {
		super();
		this.id = id;
		this.attendance = attendance;
		this.explains = explains;
		this.late = late;
		this.business = business;
		this.overtime = overtime;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getAttendance() {
		return attendance;
	}
	public void setAttendance(float attendance) {
		this.attendance = attendance;
	}
	public String getExplains() {
		return explains;
	}
	public void setExplains(String explain) {
		this.explains = explain;
	}
	public int getLate() {
		return late;
	}
	public void setLate(int late) {
		this.late = late;
	}
	public int getBusiness() {
		return business;
	}
	public void setBusiness(int business) {
		this.business = business;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
