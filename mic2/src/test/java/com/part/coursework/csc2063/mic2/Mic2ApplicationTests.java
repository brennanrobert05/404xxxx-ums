package com.part.coursework.csc2063.mic2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.part.coursework.csc2063.mic2.students.Student;

public class Mic2ApplicationTests {

    @Test
    public void testEnrol() {
        Student s = new Student("S1");
        s.enrolModule("CSC2063");
        assertTrue(s.getModules().containsKey("CSC2063"));
    }

    @Test
    public void testGrade() {
        Student s = new Student("S1");
        s.enrolModule("CSC2063");
        s.registerGrade("CSC2063", 80);
        assertEquals(80, s.getModules().get("CSC2063"));
    }
}