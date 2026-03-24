package com.part.coursework.csc2063.mic2.students;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Students {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentById(String id) {
        for(Student s : students) {
            if(s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }
}