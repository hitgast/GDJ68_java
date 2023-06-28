package com.iu.study2;

import java.util.Scanner;

public class Condition8_RPGgame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean tf = true;
		int plus = 3;
		int gold = 0;
		
		while(tf) {
			System.out.println("1. 로그인 시도, 2. 프로그램 종료");
			int onetwo = sc.nextInt();
			
			if(onetwo == 1) {
				System.out.print("ID : ");
				int loginID = sc.nextInt();
				System.out.print("PW : ");
				int loginPW = sc.nextInt();
				
				if(loginID == id && loginPW == pw){
					System.out.println("\n" + "로그인 성공");
					System.out.println("MMO RPG 시작" + "\n" + "시작 레벨 : 1");					
					for(int i=1; i<15; i++) {
						for(int j=1; j<=plus; j++) {
							System.out.println("사냥 성공!  1경험치 획득");
							System.out.println("현재레벨 : " + i + ", 현재 경험치 : " + j);
						}
						plus += 3;
						System.out.println("Level Up!!" + "\n");
						switch(i) {
						case 4: gold += 1000;
								System.out.println("1000GOLD 지급");
							break;
						case 9: gold += 2000; 
								System.out.println("2000GOLD 지급");
							break;
						case 14: gold += 3000; 
								 System.out.println("3000GOLD 지급");
							break;
						}
						System.out.println("현재골드 : " + gold);
						if(i != 14) {
							System.out.println("1. 계속하기, 2. 종료하기");
							int onetwo2 = sc.nextInt();
							if(onetwo2 == 2) {
								break;
							}
						}
					}
					tf = false;
				}
				else {
					System.out.println("로그인 실패");	
				}	
			}
			else if(onetwo == 2) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
			
		}
		
	}
}
