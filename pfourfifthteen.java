// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to compute count, average, and standard deviation
 */
import java.lang.Math;
import java.util.Scanner;
public class pfourfifthteen {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);	
		
		//Input numbers
		System.out.println("Enter numbers, at end of list, enter '1234321'");
		
		double num;
		int count = 0;
		double total = 0;
		double avg = 0;
		double totalDiff = 0;
		double nowDiff = 0;
		double variance = 0;
		
		//Compute avg, count, standard deviation
		do {
			num = in.nextDouble();
			if(num != 1234321) {
				total += num;
				count +=1;
				avg = total / count;
				
				System.out.println("num = " + num);
				System.out.println("count = " + count);
				System.out.println("total = " + total);
				System.out.println("avg = " + avg);
				
				nowDiff = Math.pow(num-avg, 2);
				System.out.println("nowDiff = " + nowDiff);
				
				totalDiff += nowDiff;
				//System.out.println("totalDiff = " + totalDiff);
				
				variance = totalDiff / count;				
				//System.out.println("variance = " + variance);
				variance = Math.sqrt(variance);
				System.out.println("Standard Deviation = " + variance);
			}		
			
		}while(num != 1234321);
		
		
		
		
		
		
		
		
		
		
	}
}
