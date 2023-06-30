package com.iu.study4;

import java.util.Scanner;

public class RifleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rifle rf = new Rifle();
		
		System.out.println("1.단발, 2.연사");
		int choose = sc.nextInt();
		
		if(choose == 1) {
			rf.shoot1();
		}
		else if(choose == 2) {
			rf.shoot2();	
		}
	}
}
