package edu.mu.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	ArrayList<Student> studentList = new ArrayList<>();
	
	public boolean readFromFile() {
		try {
			Scanner fileIn = new Scanner(new FileInputStream("files/studentData.txt"));
			while(fileIn.hasNextLine()) {
				int id = fileIn.nextInt();
				String name = fileIn.next();
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