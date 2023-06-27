package com.iu.study1;

public class Study2 {
	public static void main(String[] args) {
		int value = 35240;
		int don = 50000;
		int jandon = don - value;
		
		int man = jandon / 10000;
		int chon = (jandon % 10000) / 1000;
		int back = (jandon % 1000) / 100;
		int sib = (jandon % 100) / 10;
		
		System.out.println(jandon);
		System.out.println(man);
		System.out.println(chon);
		System.out.println(back);
		System.out.println(sib);
	}
	
}
