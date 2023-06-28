package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Condition6_for3 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
//		for(int i=0; i<10; i++) {
//			int num = ran.nextInt(10);
//			System.out.println(num);
//		}
		
//		for(int i=0; i<60; i++) {
//			for(int j=0; j<60; j++) {
//				System.out.println(i + "분" + j + "초");
//			}
//		}
		
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
		for(int i=0; i<=min; i++) {
			for(int j=0; j<=sec; j++) {
				System.out.println(i + "분" + j + "초");
			}
		}

	}

}
