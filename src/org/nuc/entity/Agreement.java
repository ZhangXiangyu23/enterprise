package org.nuc.entity;

public class Agreement {
	private int id;
	private String joins;
	private int years;
	private String retire;
	private String isworkString;
	public Agreement(int id, String joins, int years, String retire, String isworkString) {
		super();
		this.id = id;
		this.joins = joins;
		this.years = years;
		this.retire = retire;
		this.isworkString = isworkString;
	}
	public Agreement() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJoins() {
		return joins;
	}
	public void setJoins(String joins) {
		this.joins = joins;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getRetire() {
		return retire;
	}
	public void setRetire(String retire) {
		this.retire = retire;
	}
	public String getIsworkString() {
		return isworkString;
	}
	public void setIsworkString(String isworkString) {
		this.isworkString = isworkString;
	}
	
}
