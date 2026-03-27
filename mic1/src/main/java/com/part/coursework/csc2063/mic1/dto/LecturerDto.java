package com.part.coursework.csc2063.mic1.dto;

import java.util.HashMap;

public class LecturerDto {
	private String id;
	
	private HashMap<String, Integer> modules = new HashMap<>();
	
	public LecturerDto() {}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public HashMap<String, Integer> getModules(){
		return modules;
	}
	
	public void setModules(HashMap<String, Integer> modules) {
		this.modules = modules;
	}

}
