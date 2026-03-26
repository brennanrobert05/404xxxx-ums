package com.part.coursework.csc2063.mic3.dto;
import java.util.ArrayList;

public class LecturerDto {
	
	private String id;
	private ArrayList<String> moduleCodes = new ArrayList<>();

	public LecturerDto() {}

	public String getId() { return id; }
	public void setId(String id) { this.id = id; }

	public ArrayList<String> getModuleCodes() { return moduleCodes; }
	public void setModuleCodes(ArrayList<String> moduleCodes) { this.moduleCodes = moduleCodes; }
}

