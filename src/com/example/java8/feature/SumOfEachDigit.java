package com.example.java8.feature;

public class SumOfEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("sum of each digit: "+sumOfEachDigit(2355));
		System.out.println("sum of each digit using recursive: "+sumOfEachDigitRecursive(2355));
	}
	
	private static int sumOfEachDigit(int value){
		
		int sum=0,temp=0;
		temp=value;
		while(temp>0){
			sum+=temp%10;
			temp=temp/10;
		}
		return sum;
	}
	static int sum=0;
	private static int sumOfEachDigitRecursive(int value){
		
		//int sum=0;
		if(value==0){
			return sum;
		}else{
			sum+=value%10;
			sumOfEachDigitRecursive(value/10);
		}
		return sum;
	}

}
