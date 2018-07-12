package com.project.codetest.entities;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseEntity {
	
	private List<Object> responseList;
	private Map<Object,Object> responseMap;
	private Set<Object> responseSet;
	private Object response;
	private String status;
	private String message;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}
	public List<Object> getResponseList() {
		return responseList;
	}
	public void setResponseList(List<Object> responseList) {
		this.responseList = responseList;
	}
	public Map<Object, Object> getResponseMap() {
		return responseMap;
	}
	public void setResponseMap(Map<Object, Object> responseMap) {
		this.responseMap = responseMap;
	}
	public Set<Object> getResponseSet() {
		return responseSet;
	}
	public void setResponseSet(Set<Object> responseSet) {
		this.responseSet = responseSet;
	}
}
