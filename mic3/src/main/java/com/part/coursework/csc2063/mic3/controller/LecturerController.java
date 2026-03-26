package com.part.coursework.csc2063.mic3.controller;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.part.coursework.csc2063.mic3.lecturers.Lecturer;

@RestController
public class LecturerController {

    private Map<String, Lecturer> lecturers = new ConcurrentHashMap<>();

    @GetMapping("/alive")
    public String alive() {
        return "mic3 alive";
    }
    
    @PostMapping("/add/{id}")
    public String add(@PathVariable String id) {

        Lecturer l = new Lecturer(id);
        lecturers.put(id, l);

        return "Lecturer added";
    }

    @GetMapping("/findbyid/{id}")
    public Lecturer find(@PathVariable String id) {

        return lecturers.get(id);
    }
    
    @PostMapping("/{id}/modules/{module}")
    public String assign(@PathVariable String id,
                         @PathVariable String module) {

        Lecturer l = lecturers.get(id);

        if (l == null) return "not found";

        l.assignModule(module);
        return "assigned";
    }
    
    @DeleteMapping("/{id}/modules/{module}")
    public String remove(@PathVariable String id,
                         @PathVariable String module) {

        Lecturer l = lecturers.get(id);

        if (l == null) return "not found";

        l.removeModule(module);
        return "removed";
    }
}

    
    