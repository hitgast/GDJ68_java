package com.iu.study4_2;

public class Chef {
	String name;
	
	public Ramyun[] makeRamyun(int count) {
		
		Ramyun[] rams = new Ramyun[count];
		
		for(int i=0; i<count; i++) {
			Ramyun ram = new Ramyun();
			rams[i] = ram;
			
			ram.title = "진라면";
			ram.price = 3000;
		}
		
		return rams;
	}
}
