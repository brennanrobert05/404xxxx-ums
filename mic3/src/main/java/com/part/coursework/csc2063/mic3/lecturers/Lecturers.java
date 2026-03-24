package com.part.coursework.csc2063.mic3.lecturers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Lecturers {

    private List<Lecturer> lecturers = new ArrayList<>();

    public void addLecturer(Lecturer l) {
        lecturers.add(l);
    }

    public Lecturer findLecturerById(String id) {
        for(Lecturer l : lecturers) {
            if(l.getId().equals(id)) {
                return l;
            }
        }
        return null;
    }
}