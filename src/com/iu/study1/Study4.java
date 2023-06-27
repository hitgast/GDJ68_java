package com.iu.study1;

import java.util.Scanner;

public class Study4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가격 : ");
		double price = sc.nextInt();
		
		if(price < 30000) {
			price = price * 0.95 + 3000;
			System.out.println("배송비 3000원 추가");
			System.out.println("총가격 : " + price);
		}
		else {
			price = price * 0.90;
			System.out.println("배송비 무료");
			System.out.println("총가격 : " + price);
		}
	}
}
