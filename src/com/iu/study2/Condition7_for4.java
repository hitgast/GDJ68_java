package com.iu.study2;

import java.util.Scanner;

public class Condition7_for4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int shot = 30;

		System.out.println("1. 단발, 2. 점사");	
		
		for(int j=0; j<3; j++) {
			int onetwo = sc.nextInt();
			
			System.out.println("\n" + "탄창 장전" + "\n");
			for(int i=0; i<30; i++) {
				
				if(onetwo == 1) {
					System.out.println("탕" + i);
				}
				else if(onetwo == 2) {
					System.out.println("타타탕" + i);
				}
			}
		}
		
		
		
	}

}
