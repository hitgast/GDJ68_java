package com.iu.study4_2;

import java.util.Scanner;

import com.iu.study4.Student;

public class StudentService {
	public void makeStudent() {
		Student stu = new Student();
		Scanner sc = new Scanner(System.in);
		
		int guk = sc.nextInt();
		stu.name = sc.next();
		
		
	}
	
	
	
	public void makeStudents() {
		StudentService stuSer = new StudentService();
	
	
		makeStudent();
		
	}
	
}
