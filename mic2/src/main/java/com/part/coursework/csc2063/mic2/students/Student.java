package com.part.coursework.csc2063.mic2.students;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String id;
    private Map<String, Integer> modules = new HashMap<>();

    public Student() {}

    public Student(String id) {
        this.id = id;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Map<String, Integer> getModules() { return modules; }

    public void enrolModule(String module) {
        modules.put(module, null);
    }

    public void unenrolModule(String module) {
        modules.remove(module);
    }

    public void registerGrade(String module, int grade) {
        if(modules.containsKey(module)) {
            modules.put(module, grade);
        }
    }

    public void unregisterGrade(String module) {
        if(modules.containsKey(module)) {
            modules.put(module, null);
        }
    }
}