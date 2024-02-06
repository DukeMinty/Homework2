package edu.mu.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	public ArrayList<Student> studentList;
	
	public StudentManager() {
		this.studentList = new ArrayList<>();
	}
	
	public boolean readFromFile() {
		try {
			Scanner fileIn = new Scanner(new FileInputStream("files/studentData.txt"));
			while(fileIn.hasNext()) {
				int id = fileIn.nextInt();
				String name = fileIn.next() + " " + fileIn.next();
				double grade = fileIn.nextDouble();
				Student student = new Student(id,name,grade);
				studentList.add(student);
				
			}
			fileIn.close();
			return true;
		}
		catch(FileNotFoundException e) {
				e.printStackTrace();
				return false;
		}
		
	
	}	
}
