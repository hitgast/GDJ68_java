package com.iu.study3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
//		ArrayList<String> arr = new ArrayList<>();
//		arr.add("111");
//
//		String one = arr.get(0);		// 형 변환이 필요없다.
//		System.out.println(one);
		
		
		Scanner sc = new Scanner(System.in);
		Integer[] nums = {1, 2, 3, 4, 5};
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(nums));	// Arrays.asList() 함수를 이용해서
																		// 배열을 ArrayList로 변환
		System.out.println(arr);
		
		while(true) {
			System.out.print("지우고 싶은 idx번호 : ");
			int idx = sc.nextInt();
			
			if(idx > 0 && idx <= arr.size()) {
				arr.remove(idx - 1);		
				
				System.out.print("남은 값 : ");
				System.out.println(arr);
				break;
			}else {
				System.out.println("범위 밖 숫자입니다" + "\n");
			}
		}
		
		
		
		
	}
}
