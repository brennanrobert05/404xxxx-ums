package com.part.coursework.csc2063.mic3.lecturers;

import java.util.ArrayList;
import java.util.List;

public class Lecturer {

    private String id;
    private List<String> moduleCodes = new ArrayList<>();

    public Lecturer() {}

    public Lecturer(String id) {
        this.id = id;
    }

    public String getId() { return id; }

    public List<String> getModuleCodes() { return moduleCodes; }

    public void assignModule(String module) {
        if(!moduleCodes.contains(module)) {
            moduleCodes.add(module);
        }
    }

    public void removeModule(String module) {
        moduleCodes.remove(module);
    }
}