package com.iu.study2;

public class Condition2_switch {
	public static void main(String[] args) {
		int guk = 100;
		int eng = 87;
		int math = 100;
		int avg = (guk + eng + math) / 3 / 10;
		String grade = "F";
		
		switch (avg) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		}
		System.out.println("평균 : " + avg*10);
		System.out.println("성적 : " + grade);
		
	}
}
