package com.arun.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arun.beans.Employee;
import com.arun.service.EmployeeService;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/arun/resources/applicationContext.xml");
		Employee employee = (Employee)context.getBean("empBean");
		EmployeeService employeeService = (EmployeeService)context.getBean("empService");
		String message = "";
		try {
			message = employeeService.createEmployee(employee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(message);
	}

}
