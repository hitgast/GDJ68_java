package com.iu.study2;

import java.util.Scanner;

public class Condition3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		System.out.print("ID : ");
		int input_id = sc.nextInt();
		System.out.print("PW : ");
		int input_pw = sc.nextInt();
		
		if(id == input_id && pw == input_pw) {
			System.out.println("로그인 성공" + "\n");
			System.out.println("1. 정규직 , 2. 계약직");
			int onetwo = sc.nextInt();
			
			if(onetwo == 1) {
				System.out.println("정규직 입니다" + "\n");
				System.out.print("월급 : ");
				int sal = sc.nextInt();
				double tax = sal*0.03 + sal*0.02 + sal*0.01 + sal*0.01;
				
				System.out.print("세후 금액 : ");
				System.out.println(sal - (int)tax);
			}
			else {
				System.out.println("계약직 입니다" + "\n");
				System.out.print("월급 : ");
				int sal = sc.nextInt();
				double tax = sal*0.033;
				
				System.out.print("세후 금액 : ");
				System.out.println(sal - (int)tax);
			}
		}
		else {
			System.out.println("로그인 실패");
		}
		
	}
}
