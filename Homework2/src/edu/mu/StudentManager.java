package edu.mu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	private static ArrayList<Student> studentList = new ArrayList<>();
	
	public static void main(String[] args) {
		Boolean successfulRead = readFromFile();
		
		if (successfulRead) {
			for (Student student : studentList) {
				System.out.println(student.toString());
			}
		}
	}
	
	public static boolean readFromFile() {
		try {
			Scanner fileIn = new Scanner(new FileInputStream("Homework2/files/studentData.txt"));
			// hasNext method is being used as opposed to hasNextLine because a blank newline causes an error with the hasNextLine method
			while(fileIn.hasNext()) {
				int id = fileIn.nextInt();
				// Need to run next method twice for name due to next method reading until it approaches whitespace that exists between first and last name
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
