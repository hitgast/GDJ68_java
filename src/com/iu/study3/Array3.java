package com.iu.study3;

public class Array3 {

	public static void main(String[] args) {
		int[] nums = {3, 5, 1, 4, 2, 6}; 

		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {	// 1 3,5
				if(nums[i] > nums[j]) {
					int tmp = nums[i];
					
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
