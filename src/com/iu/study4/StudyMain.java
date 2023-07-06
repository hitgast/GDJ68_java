package com.iu.study4;

public class StudyMain {

	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		StudentView stuView = new StudentView();
		stu1.studNo = 1001;
		stu1.name = "kim";
		
		stu2.studNo = 1002;
		stu2.name = "park";
//		
//		stu.stuValues();
//		
//		Student[] stuArr = new Student[2];
//		stuArr[0] = stu1;
//		stuArr[1] = stu2;
//		
//		stuArr[0].stuValues();
//		stuArr[1].stuValues();
		
		
		//stuView.view(stu1.name, stu1.studNo);
		
		stuView.viewAll(new String[] {"윈터", "카리나"});

	}
}
