package com.arun.service;

import com.arun.beans.Employee;

public interface EmployeeService {
	public String createEmployee(Employee e) throws Exception;
	public Employee searchEmployee(int eno);
	public String updateEmployee(Employee e);
	public String deleteEmployee(Employee emp);
}
