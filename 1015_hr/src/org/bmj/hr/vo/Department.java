package org.bmj.hr.vo;

public class Department {	
	private int departmentId;
	private String departmentName;
	private int managerId;
	private int locationId;
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public Department() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		
		return departmentId +") " + departmentName;
	}
}