package com.project.codetest.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.codetest.CodeTestApplicationServer;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CodeTestApplicationServer.class)
public class TestCodeCoreServices {

	@Autowired
	private ICodeCoreServices codeCoreServices;
	
	public TestCodeCoreServices() {
	}
	
	@Test
	public void testGetEmployeeData() {
		codeCoreServices.getEmployeesData();
	}
}
