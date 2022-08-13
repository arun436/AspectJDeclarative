package com.arun.service;

import com.arun.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String createEmployee(Employee e) throws Exception {
		
		System.out.println("Employee " + e.getEno() + " Inserted successfully");
		
		return "Success";
	}

	@Override
	public Employee searchEmployee(int eno) {
		
		System.out.println("Employee with number " + eno + " existed");
		return null;
	}

	@Override
	public String updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		System.out.println("Employee " + e.getEname() + " updated successfully");
		return "Success";
	}

	@Override
	public String deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Employee " + emp.getEname() + " deleted successfully!");
		return "Success";
	}

}
