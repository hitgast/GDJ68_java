package com.iu.study2;

import java.util.Scanner;

public class Condition1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("국어 : ");
//		int guk = sc.nextInt();
//		System.out.print("영어 : ");
//		int eng = sc.nextInt();
//		System.out.print("수학 : ");
//		int math = sc.nextInt();
		//int avg = (guk + eng + math) / 3;
		int avg = 59;
		String grade = "F";
		
//		if(avg >= 60 && avg < 70) {
//			System.out.println("D");
//		}
//		if(avg >= 70 && avg < 80) {
//			System.out.println("C");
//		}
//		if(avg >= 80 && avg < 90) {
//			System.out.println("B");
//		}
//		if(avg >= 90) {
//			System.out.println("A");
//		}
//		if(avg < 60) {
//			System.out.println("F");			
//		}
		
		if(avg >= 60) {
			grade = "D";
		}
		if(avg >= 70) {
			grade = "C";
		}
		if(avg >= 80) {
			grade = "B";
		}
		if(avg >= 90) {
			grade = "A";
		}
	
		System.out.println(grade);
		
	}
}

