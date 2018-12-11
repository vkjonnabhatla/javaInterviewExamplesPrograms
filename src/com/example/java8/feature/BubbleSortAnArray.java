package com.example.java8.feature;

public class BubbleSortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={22,33,55,21,18,64,35,65};
		int temp1=0;
		int temp2=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp1=arr[i];
					temp2=arr[j];
					arr[i]=temp2;
					arr[j]=temp1;
				}
			}
		}
		for(int val:arr){
			System.out.print(val+",");
		}
	}

}
