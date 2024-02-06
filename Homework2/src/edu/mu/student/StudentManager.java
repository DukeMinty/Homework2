package edu.mu.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	private Student[] studentList;
	
	public StudentManager() {
		this.studentList = new Student[6];
	}
	public StudentManager(int value) {
		this.studentList = new Student[value];
	}
	
	public boolean readFromFile(String filePath) {
		try {
			Scanner fileIn = new Scanner(new FileInputStream(filePath));
			while(fileIn.hasNext()) {
				int id = fileIn.nextInt();
				String name = fileIn.next() + " " + fileIn.next();
				double grade = fileIn.nextDouble();
				Student student = new Student(id,name,grade);
				//Ask prof how to initialize this array
				//Does he want us to just make it a pre-determined length?
				//Or find it's length another way and make it part of the StudentManager constructor?
				
				//studentList.add(student);
				
			}
			fileIn.close();
			return true;
		}
		catch(FileNotFoundException e) {
				e.printStackTrace();
				return false;
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
}
