package com.part.coursework.csc2063.mic2.controller;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.part.coursework.csc2063.mic2.students.Student;

@RestController
public class StudentController {

    // 🔥 STORAGE (IMPORTANT)
    private Map<String, Student> students = new ConcurrentHashMap<>();

    @GetMapping("/alive")
    public String alive() {
        return "mic2 alive";
    }
    
 // Add student
    @PostMapping("/add/{id}")
    public String add(@PathVariable String id) {

        Student s = new Student(id);
        students.put(id, s);

        return "Student added";
    }

    // Find student
    @GetMapping("/findbyid/{id}")
    public Student find(@PathVariable String id) {

        return students.get(id);
    }
    
    @PostMapping("/{id}/enrol/{module}")
    public String enrol(@PathVariable String id,
                        @PathVariable String module) {

        Student s = students.get(id);

        if (s == null) return "not found";

        s.enrolModule(module);
        return "enrolled";
    }
    
    @DeleteMapping("/{id}/enrol/{module}")
    public String unenrol(@PathVariable String id,
                          @PathVariable String module) {

        Student s = students.get(id);

        if (s == null) return "not found";

        s.unenrolModule(module);
        return "removed";
        
        
    }
    
    @PostMapping("/{id}/grade/{module}")
    public String grade(@PathVariable String id,
                        @PathVariable String module,
                        @RequestParam int grade) {

        Student s = students.get(id);

        if (s == null) return "not found";

        s.registerGrade(module, grade);
        return "graded";
    }
    
    @DeleteMapping("/{id}/grade/{module}")
    public String removeGrade(@PathVariable String id,
                              @PathVariable String module) {

        Student s = students.get(id);

        if (s == null) return "not found";

        s.unregisterGrade(module);
        return "grade removed";
    }
}
