package com.project.codetest.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.codetest.entities.ResponseEntity;
import com.project.codetest.services.ICodeCoreServices;

@CrossOrigin
@RestController
@RequestMapping("/CodeTest")
public class CodeCoreController {
	
	private ResponseEntity responseEntity;
	private ICodeCoreServices codeCoreServices;
	
	public CodeCoreController(ResponseEntity responseEntity,ICodeCoreServices codeCoreServices) {
		this.responseEntity = responseEntity;
		this.codeCoreServices = codeCoreServices;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity login(){
		System.out.println("Hello Welocome to login call!!!!");
		List<Object> result = codeCoreServices.getEmployeesData();
		responseEntity.setResponseList(result);
		responseEntity.setResponse("Login Successfully Completed!!!!");
		return responseEntity;
	}

}
