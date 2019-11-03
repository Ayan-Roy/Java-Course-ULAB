package com.ulab.edu;

import java.util.Scanner;

public class Main {
	
	
	public float calculateFeesWithMerits(int fees, float waivour) {
		
		float totalFees = (fees*(waivour/100));

		return totalFees;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Demo obj = new Demo();
		
		
		
		System.out.print("Enter your Credit: ");
		int credit = scan.nextInt();
		
		System.out.println();
		int fees = obj.calculateFees(credit);
		
		System.out.println("Total Fees without waivour is: " +fees);
		
		System.out.print("Enter your cGpa: ");
		float cGpa = scan.nextFloat();
		
		
		int waivour = obj.offerScholership(cGpa);
		System.out.println(waivour);
		
		Main obj2 = new Main();
		
		float total_fees = obj2.calculateFeesWithMerits(fees, waivour);
		
		System.out.println();
		System.out.println("Final Fees after waivour is: "+total_fees);
		
		
		
		
		
	}

	
	

	
}
