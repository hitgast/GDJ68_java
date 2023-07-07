package com.iu.study5_2;

public class Customer {
	private int money;
	private int point;
	
	public Customer() {
		this.money = 50000000;
		this.point = 50000;
	}
	
	public void buy(Parents pa) {
		this.money -= pa.getPrice();
		this.point += pa.getPoint();
		
		System.out.println("남은 돈 : " + this.money);
		System.out.println("남은 포인트 : " + this.point);
	}
	public void buy(Parents[] pa) {
		for(int i=0; i<pa.length; i++) {
			this.buy(pa[i]);
		}
	}
	
}
