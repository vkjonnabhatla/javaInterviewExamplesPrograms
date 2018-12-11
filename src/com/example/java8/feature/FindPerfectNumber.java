package com.example.java8.feature;

public class FindPerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findPerfect(8);
	}
	
	public static void findPerfect(int value){
		
		int temp=0;
		for(int i=1;i<=value/2;i++){
			if(value%i==0){
				temp+=i;
			}
		}
		if(temp==value){
			System.out.println("given value is perfect number: "+value);
		}else{
			System.out.println("given value is not perfect number: "+value);

		}
		
	}

}
