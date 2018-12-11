package com.example.java8.feature;

public class FindTopTwoMaxNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,10,5,15,55,6,99,99,55};
		findMaxTwoNumbersFromArray(arr);
	}


	public static void findMaxTwoNumbersFromArray(int[] arr){
		int max1=0,max2=0;
		for(int value:arr){
			if(max1<value){
				max2=max1;
				max1=value;
			}else if(max2<value){
				max2=value;
			}	
		}
		System.out.println("Max1 Number is: "+max1+"---"+"Max2 Number is: "+max2);
	}

}
