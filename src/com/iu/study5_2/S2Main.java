package com.iu.study5_2;

public class S2Main {

	public static void main(String[] args) {
		Computer com = new Computer();
		com.setMake("samsung");
		com.setModel("갤럭시북");
		com.setColor("black");
		com.setCpu("i9");
		com.setPoint(2000);
		com.setPrice(2000000);
		
		Tv tv = new Tv();
		tv.setMake("LG");
		tv.setModel("tv");
		tv.setColor("blue");
		tv.setInch(50);
		tv.setPoint(100);
		tv.setPrice(1500000);
			
		Customer iu = new Customer();
		//iu.buy(tv);
		
		Parents[] pa = new Parents[2];
		pa[0] = com;
		pa[1] = tv;
		iu.buy(pa);

	}

}
