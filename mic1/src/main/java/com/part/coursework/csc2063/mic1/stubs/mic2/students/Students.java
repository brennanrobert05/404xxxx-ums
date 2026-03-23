package com.part.coursework.csc2063.mic1.stubs.mic2.students;

import java.util.ArrayList;

public class Students {
	private ArrayList<Student> students = new ArrayList<>();

	public Students() {
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = (students == null) ? new ArrayList<>() : students;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		if (student == null)
			return;
		students.add(student);
	}

	public Student findStudentById(String id) {
		if (id == null)
			return null;
		for (Student s : students) {
			if (id.equals(s.getId()))
				return s;
		}
		return null;
	}
}
