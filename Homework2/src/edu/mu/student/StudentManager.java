package edu.mu.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentManager {
	
	private Student[] studentList;
	
	public StudentManager() {
		studentList = new Student[5];
	}
	public StudentManager(int value) {
		studentList = new Student[value];
	}
	
	public boolean readFromFile(String filePath) {
		try {
			Scanner fileIn = new Scanner(new FileInputStream(filePath));
//			while(fileIn.hasNext()) {
				for (int i = 0; i < studentList.length; i++) {
					int id = fileIn.nextInt();
					String name = fileIn.next() + " " + fileIn.next();
					double grade = fileIn.nextDouble();
					Student student = new Student(id,name,grade);
					studentList[i] = student;
			}
			fileIn.close();
			return true;
		}
		catch(FileNotFoundException e) {
				e.printStackTrace();
				return false;
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
			return false;
		}
	}
	public void displayStudents() {
		if(this.studentList == null|| this.studentList.length <= 0) {
			System.out.println("Student array is Empty");
		}else{
			System.out.println("Students: ");
			for(Student student : this.studentList) {
				System.out.println(student.toString());
			}
		}		
	}
	
	public boolean searchStudentById(int id) {
		for (Student student : this.studentList) {
			if (student.equals(id)) {
				System.out.println("Student found: \n\t" + student.toString());
				return true;
			}
		}
		System.out.println("No student with Id: " + id + " was found.");
		return false;
	}
	
	public boolean updateStudentGradeById(int id, double grade) {
		if (searchStudentById(id)){
			for (Student student : this.studentList) {
				if (student.getId() == id) {
					student.setGrade(grade);
					return true;
				}
			}
		}
		return false;
	}	
}
