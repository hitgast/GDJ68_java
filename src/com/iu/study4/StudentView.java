package com.iu.study4;

public class StudentView {
	String name;
	char gender;
	String[] names;
	
	void view(String name, char gender) {
		this.name = name;
		this.gender = gender;
		
		System.out.println("이름 : " + this.name);
		System.out.println("성별 : " + this.gender);
	}
	
	void viewAll(String[] names) {
		this.names = names;
		
		for(String vlaues : this.names) {
			System.out.println("이름 : " + vlaues);
		}
	}
}
