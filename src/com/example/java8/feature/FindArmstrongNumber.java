package com.example.java8.feature;

public class FindArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmstrongNumber(372);
	}
	public static void isArmstrongNumber(int value){

		int temp=0,sum=0,div=0;
		temp=value;
		while (temp>0) {
			div=temp%10;
			temp=temp/10;
			sum=sum+(div*div*div);		
		}
		if(sum==value){
			System.out.println("Given number is Armstrong :"+value);
		}else{
			System.out.println("Given number is not Armstrong :"+value);
		}
	}
}
