package com.iu.study1;

class All{
	int[] values;
	
	All(int[] values){				// 입력값을 배열로 받는 생성자 
		this.values = values;
	}
	
	void sum() {
		int total = 0;
		
		for(int val : this.values) {		// for-each문(배열 전용 반복문)을 이용해 배열의 값들을 더해줌
			total += val;
		}
		System.out.println("합계 : " + total);
	}
	void avg() {
		int total = 0;
		
		for(int val : this.values) {
			total += val;
		}
		System.out.println("평균 : " + total / values.length);
	}
}

class Multifly extends All{
	Multifly(int[] values){
		super(values);
	}
	
	void multi() {
		int total = 1;
		
		for(int val : this.values) {
			total *= val;
		}
		System.out.println("곱한값 : " + total);
	}
}

public class Study3 {

	public static void main(String[] args) {
		int guk = 10;
		int eng = 20;
		int math = 30;
		int result = guk + eng + math;
		
		int[] array = {10, 20, 30};
		
		//All all = new All(array);
		All all = new All(new int[] {10, 20, 30, 50});	// 배열을 변수로 생성하지 않고, 배열을 직접 생성한다
		all.sum();
		all.avg();
		
		System.out.println("-------------------");
		
		Multifly mul = new Multifly(new int[] {10, 20, 30});
		mul.sum();
		mul.avg();
		mul.multi();
	}
}
