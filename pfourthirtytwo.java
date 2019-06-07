// Copyright (c) 2019, Matthew Chalifoux.

/**
   Enter 8 digit credit card number and verify it
 */
import java.util.Scanner;
public class pfourthirtytwo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Enter 8 digit number
		System.out.println("Enter 8 digit number : ");
		
		String num = in.next();
		
		System.out.println("num = " + num);
		
		int first = 0; 
		
		int i = 7;
		
		//Get the first part
		while(i > 0) {
			
			first += Character.getNumericValue(num.charAt(i));
			i = i - 2;
			
		}
		System.out.println("first = " + first);
		
		//Get the second part
		int second = 0;
		String scd = "";
		i = 6;
		while(i >= 0) {
			second = 0;
			int sub = Character.getNumericValue(num.charAt(i));			
			second += 2*sub;
			scd += second;
			i = i - 2;			
		}

		//
		int total = 0;
		for(int j = 0; j < scd.length(); ++j) {
			total += Character.getNumericValue(scd.charAt(j));
		}
		
		System.out.println("second = " + total);
		int combine = 0;
		
		//Combine the first and second
		combine = first + total;
		System.out.println("Sum of first and second = " + combine);
		
		//Check if last digit is a '0'
		String some = "" + combine;
		int op = some.length() - 1;
		
		if(some.charAt(op) == '0') {
			System.out.println("Credit Card is valid");
		}
		else {
			System.out.println("Credit Card is invalid");
		}
	}
	
}
