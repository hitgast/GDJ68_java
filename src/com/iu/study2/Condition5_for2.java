package com.iu.study2;

import java.util.Scanner;

public class Condition5_for2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		for(int i=1; i<6; i++) {
			System.out.print("ID : ");
			int loginID = sc.nextInt();
			System.out.print("PW : ");
			int loginPW = sc.nextInt();
			
			if(loginID == id && loginPW == pw) {
				System.out.println("로그인 성공");
				System.out.println("급여 계산");
				break;
			}
			else {
				System.out.println("로그인 실패" + "\n");
			}
		}
	}
}
