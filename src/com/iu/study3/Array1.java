package com.iu.study3;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		//int[] nums = new int[] {1, 2};		// 데이터타입[] 변수명 = 정수 타입의 배열을 변수명 없이 직접 생성
		//nums[0] = 1;
		//nums[1] = 2;
												
		//System.out.println(nums);		// '[I@7d6f77cc' 이렇게 출력 ([ : 배열, I : int타입, @ : 주소)
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("배열의 갯수 입력 : ");
//		int count = sc.nextInt();
//		int[] nums = new int[count];
//		
//		for(int i=0; i<count; i++) {
//			System.out.println(nums[i]);
//		}
		
		ArrayList<Object> arr = new ArrayList<Object>();           // ArrayList객체 생성
		arr.add(111); 	                           // .add() 메서드를 이용하여 "111"값 삽입
		arr.add("133");
		arr.add(0, "100");                         // 0번째 위치에 "100"값 삽입
		String one = (String) arr.get(0);          // Object자료형 을 String자료형 으로 형변환

		System.out.println(arr.get(0));            // .get() 메서드 : arr의 0번째 값 출력
		System.out.println(arr.size());            // .size() 메서드 : arr에 담긴 갯수 출력
		System.out.println(arr.contains("111"));   // .contains() 메서드 : arr객체 안에 "111"이란 값이 있는지 판별하여
		                                           //  그 값을 boolean형으로 리턴(true 출력)
		//System.out.println(arr.remove("133"));     // .remove() 메서드 : arr객체 안의 "133" 값을 삭제하고 결과(true, false)를 리턴
		//System.out.println(arr.remove(1));         // arr객체 안의 2번째 값을 삭제하고 삭제된 값("133")을 리턴
		System.out.println(arr);
		
	}

}
