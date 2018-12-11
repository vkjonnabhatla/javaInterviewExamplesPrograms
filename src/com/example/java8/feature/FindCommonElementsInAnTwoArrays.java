package com.example.java8.feature;

public class FindCommonElementsInAnTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]={1,2,3,4};
int ar1[]={1,5,6,4};
		findCommonElements(ar,ar1);
		
	}
	public static void findCommonElements(int[] arr1, int[] arr2){
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println("Repeated number is: "+arr1[i]);
				}
			}	
		}
		
	}

}
