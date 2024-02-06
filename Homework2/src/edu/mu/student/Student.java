package edu.mu.student;

public class Student {

	private int id;
	private String name;
	private double grade;
	
	public Student() {
		this.id = 0;
		this.name = "";
		this.grade = 0.0;
	}
	
	public Student(int id, String name, double grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public String toString() {
		String studentString = "Name: " + this.getName() + ", ID: " + this.getId() + ", Grade: " + this.getGrade();
		return studentString;
	}
	
	public boolean equals(Object obj) {
		Student s = ((Student)obj);
		
		if (this.getName().equals(s.getName()) &&
					this.getId() == s.getId() &&
					this.getGrade() == s.getGrade()) {
			return true;
		}
		
		return false;
	}
	
	public boolean equals(int id) {
		return this.getId() == id;
	}
}
