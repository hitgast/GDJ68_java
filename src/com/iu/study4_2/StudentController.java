package com.iu.study4_2;

import java.util.Scanner;

public class StudentController {
	public void start() {
//		1. 학생정보 생성		/ makeStudents 호출
//		2. 학생정보 출력		/ StudentView에서 출력
//		3. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		StudentService stuS = new StudentService();
		StudentView stuV = new StudentView();
		Student2 stu = new Student2();
		Student2[] students = new Student2[0];
		
		while(true) {
			System.out.println("1.학생정보 생성, 2.학생정보 출력, 3.학생정보 검색");
			int select = sc.nextInt();
			
			if(select == 1) {
				students = stuS.makeStudents();
			}else if(select == 2) {
				stuV.view(students);
			}else if(select == 3) {
				
			}else {
				System.out.println("종료");
				break;
			}
		}
		
	}
	
}
