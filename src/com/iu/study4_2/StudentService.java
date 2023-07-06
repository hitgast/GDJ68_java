package com.iu.study4_2;

import java.util.Scanner;

import com.iu.study4.Student;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	
	public void findByNum() {
		System.out.print("찾으려는 학생 번호 : ");
		int findnum = sc.nextInt();
	}
	
	public Student2 makeStudentOne() {	
		Student2 student = new Student2();	
		
		System.out.println("이름을 입력");
		student.name = sc.next();
		System.out.println("번호를 입력");
		student.num = sc.nextInt();
		System.out.println("국어를 입력");
		student.kor = sc.nextInt();
		System.out.println("영어를 입력");
		student.eng = sc.nextInt();
		System.out.println("수학을 입력");
		student.math = sc.nextInt();
		
		student.total = student.kor+student.eng+student.math;
		student.avg = student.total/3.0;
		
		return student;
	}
	
	
	
	public Student2[] makeStudents() {
		System.out.print("학생 수 입력 : ");
		int count = sc.nextInt();
		
		Student2[] students = new Student2[count];
		
		for(int i=0; i<count; i++) {
			Student2 student = new Student2();
			students[i] = student;
			
			System.out.println("이름을 입력");
			student.name = sc.next();
			System.out.println("번호를 입력");
			student.num = sc.nextInt();
			System.out.println("국어를 입력");
			student.kor = sc.nextInt();
			System.out.println("영어를 입력");
			student.eng = sc.nextInt();
			System.out.println("수학을 입력");
			student.math = sc.nextInt();
			
			student.calculator();
		}
		
		return students;
	}
	
}
