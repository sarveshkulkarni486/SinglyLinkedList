package com.example.beans;

public class Employee {
	private int eid;
	private String empname;
	public Employee() {
		super();
	}
	public Employee(int eid, String empname) {
		super();
		this.eid = eid;
		this.empname = empname;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empname=" + empname + "]";
	}
	

}
