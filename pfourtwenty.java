// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to print squares filled and open after a given side length
 */

import java.util.Scanner;
public class pfourtwenty {
	
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	//Receive length of desired side
	System.out.println("Enter length of side : ");
	int side = in.nextInt();
	
	//Algorithm for printing out boxes
	for(int i = 0; i < side; ++i) {
		for(int j = 0; j < side; ++j) {
			System.out.print("*");			
		}
		System.out.print(" ");
		if(0 == i || side - 1 == i) {
			for(int j = 0; j < side; ++j) {
				System.out.print("*");			
			}
		}
		else {
			for(int j = 0; j < side; ++j) {
				if(0 == j || side-1 == j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		}
		
		
		System.out.println("");
	}
	
	
	
	
	}
}
