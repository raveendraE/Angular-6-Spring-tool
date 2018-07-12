package com.project.codetest.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import com.project.codetest.entities.Employee;

@Component
public class ApplicationUtitlities {
	
	@Autowired
	ResourceLoader resourceLoader;
	
	public List<String> getEmployees() {
		List<String> employees = new ArrayList<String>();
		Resource resource = resourceLoader.getResource("classpath:employees.txt");
		try {
			File file = resource.getFile();
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				employees.add(sc.next());
			}
			System.out.println("Employees >> " + employees);
			//sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employees;
	}

	public List<Object> populateEmployeeData() {
		List<String> employees = getEmployees();
		List<Object> resultlist = new ArrayList<Object>();
		for (String value : employees) {
			String[] inputEmployee = value.split(",");
				 Employee employee = new Employee();
				 employee.setId(inputEmployee[0]);
				 employee.setName(inputEmployee[1]);
				 employee.setEmail(inputEmployee[2]);
				 employee.setDept(inputEmployee[3]);
				 employee.setAddress(inputEmployee[4]);
				 employee.setPincode(inputEmployee[5]);
				 employee.setCountry(inputEmployee[6]);
				 resultlist.add(employee);
		}
		return resultlist;
	}
}
