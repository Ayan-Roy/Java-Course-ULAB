package com.ulab.edu;

public class Demo {

	public int calculateFees(int credit) {
		int fees = credit*5000;
		return fees;
	}
	

	
	public int offerScholership(float cGpa) {
		
		
		if(cGpa>3.79) {
			System.out.println("Congratulations! you have got Presidential Scholarship.");
			return 50;
		}
		
		if(cGpa>=3.5 && cGpa<=3.79) {
			
			System.out.println("Congratulations! you have got VC Scholarship.");
			return 30;
		}
		
		if(cGpa>=3.3 && cGpa<=3.49) {
			
			System.out.println("Congratulations! you have got Deans Scholarship.");
			return 10;
		}
		System.out.println("Sorry, no Schlorship for you.");
		return 0;
	}
	
	

	
	
	
	
	
	
	
	
}
