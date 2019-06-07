// Copyright (c) 2019, Matthew Chalifoux.
/**
   Program to check how many syllables are in a word
 */

import java.util.Scanner;
public class pfoureleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//User enters a word
		Scanner in = new Scanner(System.in);		
		System.out.print("Enter a word : ");
		
		String word = in.next();
		
		//System.out.print(word);
		
		//Set int variables to count the vowels, set bool var to count vowels in a row
		//set int var to count word length
		int count = 0;
	    boolean prevVowel = false;	    
	    int size = word.length();
	    word = word.toLowerCase();
	    
	    //Loop program to check every letter in word
	    for(int i = 0; i < size; ++i) {
	    	
	    	//If letter in word is a vowel
	    	if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' 
	    	   || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y') {
	    		
	    		//System.out.print("VOWEL");
	    		
	    		//If previous letter is not a vowel
	    		//If last letter is an e, dont count it, else count it
	    		if(prevVowel == false) {
	    			if(i == size - 1 && word.charAt(i) == 'e') {
	    				
	    			}
	    			else {
	    				count += 1;
		    			prevVowel = true;
	    			}
	    			
	    		}
	    		
	    		
	    	}
	    	//If letter is not a vowel
	    	else {
	    		prevVowel = false;
	    	}
	    	
	    	//If vowel count is 0 at the end, make count 1
	    	if(i == size - 1) {
		    	if(0 == count) {
		    		count = 1;
		    	}
		    }
	    }    
	    System.out.print("The count is " + count);
	    
	}
	

}
