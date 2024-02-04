package edu.mu.student;

public class Student {

	private int id;
	private String name;
	private double grade;
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
	public boolean toString(Student student) {
		if(student==null) {
			return false;
		}
		else {
			System.out.println("Name: " + student.getName() + ", ID: " + student.getId() + ", Grade: " + student.getGrade());
			return true;
		}
	}
}
