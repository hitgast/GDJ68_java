package com.iu.study4_4;

public class S4Main {

	public static void main(String[] args) {
		//StaticTest st = new StaticTest();
		
		StaticTest.staticNum = 20;
		System.out.println(StaticTest.staticNum);
		StaticTest.staticMethod();

	}

}
