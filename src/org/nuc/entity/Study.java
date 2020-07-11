package org.nuc.entity;

public class Study {
	private int id;
	private String starttime;
	private String endtime;
	private String content;
	public Study(int id, String starttime, String endtime, String content) {
		super();
		this.id = id;
		this.starttime = starttime;
		this.endtime = endtime;
		this.content = content;
	}
	public Study() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Study [id=" + id + ", starttime=" + starttime + ", endtime=" + endtime + ", content=" + content + "]";
	}
	
}
