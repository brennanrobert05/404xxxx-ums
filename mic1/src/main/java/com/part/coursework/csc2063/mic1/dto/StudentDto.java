package com.part.coursework.csc2063.mic1.dto;

import java.util.HashMap;
import java.util.Map;

public class StudentDto {
    private String id;
    // Map to store Module Code as key and Grade (Integer) as value
    private Map<String, Integer> moduleCodes = new HashMap<>();
    
    public StudentDto() {}
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id; // Fixed logic
    }
    
    public Map<String, Integer> getModuleCodes() {
        return moduleCodes;
    }
    
    public void setModuleCodes(Map<String, Integer> moduleCodes) {
        this.moduleCodes = moduleCodes;
    }
}
