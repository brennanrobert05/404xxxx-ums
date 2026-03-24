package com.part.coursework.csc2063.mic1.controller;

import com.part.coursework.csc2063.mic1.stubs.mic2.students.Student;
import com.part.coursework.csc2063.mic1.stubs.mic2.students.Students;
import com.part.coursework.csc2063.mic1.stubs.mic2.students.ModuleCode;

import com.part.coursework.csc2063.mic1.stubs.mic3.lecturers.Lecturer;
import com.part.coursework.csc2063.mic1.stubs.mic3.lecturers.Lecturers;

public class Controller {

    private Students students;
    private Lecturers lecturers;

    public Controller() {
        this.students = new Students();
        this.lecturers = new Lecturers();
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Students getStudents() {
        return students;
    }

    public void setLecturers(Lecturers lecturers) {
        this.lecturers = lecturers;
    }

    public Lecturers getLecturers() {
        return lecturers;
    }

    // --- Student operations (UML) ---

    public void enrolStudent(Student student, com.part.coursework.csc2063.mic1.stubs.mic2.students.ModuleCode moduleCode) {
        if (student == null || moduleCode == null) return;
        student.enrolModuleCode(moduleCode);
    }

    public void unenrolStudent(Student student, com.part.coursework.csc2063.mic1.stubs.mic2.students.ModuleCode moduleCode) {
        if (student == null || moduleCode == null) return;
        student.unenrolModuleCode(moduleCode);
    }

    public void registerGrade(Student student, com.part.coursework.csc2063.mic1.stubs.mic2.students.ModuleCode moduleCode, int grade) {
        if (student == null || moduleCode == null) return;
        student.registerGrade(moduleCode, grade);
    }

    public void unregisterGrade(Student student, com.part.coursework.csc2063.mic1.stubs.mic2.students.ModuleCode moduleCode) {
        if (student == null || moduleCode == null) return;
        student.unregisterGrade(moduleCode);
    }

    // --- Lecturer operations (UML) ---

    public void addLecturer(Lecturer lecturer) {
        if (lecturer == null) return;
        if (lecturers != null) {
            lecturers.getLecturers().add(lecturer);
        }
    }

    public void assignModuleCodeToLecturer(Lecturer lecturer, com.part.coursework.csc2063.mic1.stubs.mic3.lecturers.ModuleCode moduleCode) {
        if (lecturer == null || moduleCode == null) return;
        lecturer.assignModuleCode(moduleCode);
    }

    public void removeModuleCodeFromLecturer(Lecturer lecturer, com.part.coursework.csc2063.mic1.stubs.mic3.lecturers.ModuleCode moduleCode) {
        if (lecturer == null || moduleCode == null) return;
        lecturer.removeModuleCode(moduleCode);
    }
}
