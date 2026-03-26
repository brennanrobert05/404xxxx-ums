package com.part.coursework.csc2063.mic2.dto;
import java.util.ArrayList;

public class StudentDto {

    private String id;
    private ArrayList<String> moduleCodes = new ArrayList<>();

    public StudentDto() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public ArrayList<String> getModuleCodes() { return moduleCodes; }
    public void setModuleCodes(ArrayList<String> moduleCodes) { this.moduleCodes = moduleCodes; }
}