package com.iu.study4_4;

public class StaticTest {
	public int instanceNum = 1;
	public static int staticNum;
	
	public void instanceMethod() {
		System.out.println("멤버메서드");
		System.out.println(this.instanceNum);
		System.out.println(this.staticNum);
	}
	
	public static void staticMethod() {
		StaticTest st = new StaticTest();
		
		staticNum = 30;
		System.out.println(staticNum);
//		System.out.println(instanceNum);		// 클래스메서드 에서는 인스턴스멤버 를 접근할수 없어서 오류
		System.out.println(st.instanceNum);		// 객체생성해서 하면 가능
		System.out.println("클래스메서드");
	}
}
