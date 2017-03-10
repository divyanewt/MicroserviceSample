package com.entity;

public class Department {
	private int depId;
	private String depName;
	private String location;
	public Department(int depId, String depName, String location) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.location = location;
	}
	public Department(){}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", location=" + location + "]";
	}
	

}
