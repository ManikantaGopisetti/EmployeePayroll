package com.bridgelabz.fileio;

public class EmployeePayroll {

	public int id;
	public String name;
	public double salary;

	public EmployeePayroll(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + "";
	}

}
