package com.example.java8.feature;

public class ConvertNumericStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		convertStringToInteger("1334");
		
	}

	public static void convertStringToInteger(String str){
		
		int sum=0;
		int zeroAscii=(int)'0';
		for(int i=0;i<str.length();i++){
			int tempAscii =(int)str.charAt(i);
			sum =(sum*10)+(tempAscii-zeroAscii);
			
		}
		System.out.println("converted integer value is: "+sum);
	}
}
