package com.example.java8.feature;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNumber(54321);
		
	}
	
	private static void reverseNumber(int value){
		//System.out.println(1/10);
		int reverse=0;
		int number=value;
		while (number!=0) {
			reverse=(reverse*10)+(number%10);
			number=number/10;
		}
		System.out.println(value+" is reversed to "+reverse);
		
	}

}
