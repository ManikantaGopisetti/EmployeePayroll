package com.bridgelabz.fileio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	private List<EmployeePayroll> employeePayrollList;

	public EmployeePayrollService() {

	}

	public EmployeePayrollService(List<EmployeePayroll> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	public static void main(String[] args) {

		ArrayList<EmployeePayroll> employeePayrollList = new ArrayList<EmployeePayroll>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData();

	}

	public void writeEmployeePayrollData() {

		System.out.println("\nwriting employee payroll to console " + employeePayrollList);

	}

	private void readEmployeePayrollData(Scanner consoleInputReader) {

		System.out.print("Reading information from console \nEnter employee id  : ");
		int id = consoleInputReader.nextInt();
		System.out.print("Enter employee name : ");
		String name = consoleInputReader.next();
		System.out.print("Enter employee salary : ");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayroll(id, name, salary));

	}

}