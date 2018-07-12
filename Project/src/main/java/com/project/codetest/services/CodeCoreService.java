package com.project.codetest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.codetest.entities.Employee;
import com.project.codetest.utilities.ApplicationUtitlities;

@Service
public class CodeCoreService implements ICodeCoreServices{

	private ApplicationUtitlities applicationUtitlities;
	
	public CodeCoreService(Employee employee,ApplicationUtitlities applicationUtitlities) {
		this.applicationUtitlities = applicationUtitlities;
	}

	public List<Object> getEmployeesData(){
		List<Object> result = null;
		result = applicationUtitlities.populateEmployeeData();
		System.out.println("Hi Hello !!!!");
		return result;
	}
}
