package com.iu.study4_2;

public class StudentView {
	public void view(Student2 student) {
		
		System.out.println("이름 : " + student.name);
		System.out.println("학생번호" + student.num);
		System.out.println("평균" + (int)student.avg);
		System.out.println("===================");
	}
	
	public void view(Student2[] students) {
		for(int i=0; i<students.length; i++) {
			Student2 stu = students[i];
			
			System.out.println("이름 : " + stu.name);
			System.out.println("학생번호" + stu.num);
			System.out.println("평균" + (int)stu.avg);
			System.out.println("===================");
		}
	}
}
