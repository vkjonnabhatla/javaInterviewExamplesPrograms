package com.example.java8.feature;

public class DuplicateCharacters {

	public static void main(String[] args){

		int x=10;
		int y=20;
		
		x=x+y;//30
		y=x-y;//10
		x=x-y;//20
		System.out.println( "After swapping x and y :"+x+" "+y);
		
		
		
		findDuplicates("jaiaijjip");
	}
	
	static final int NO_OF_CHARS = 127;
	 static void fillCharCounts(String str, int[] count) 
	    { 
	      for(int i=0;i<str.length();i++)
	    	  count[str.charAt(i)]++;
	    } 
	
	public static void findDuplicates(String str){
	
		int[] count=new int[NO_OF_CHARS];
		for(int i=0;i<str.length();i++)
	    	  count[str.charAt(i)]++;
		
		//fillCharCounts(str, count);
		for(int i=0;i<NO_OF_CHARS;i++)
			if(count[i]>1)
				System.out.printf("%c-- Repeated = %d \n",i,count[i]);

	    } 
	}
	

