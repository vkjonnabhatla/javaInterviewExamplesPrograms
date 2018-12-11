package com.example.java8.feature;

public class PrintDistinctElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {5,2,7,2,4,7,8,2,3,100};
		printDistinctElements(nums);
		//nonRepeatedElements(nums);
		
	}

	public static void printDistinctElements(int[] val){
		
		for(int i=0;i<val.length;i++){
			boolean isDistinct=false;
			for(int j=i+1;j<val.length;j++){
				if(val[i]==val[j]){
					isDistinct=true;
					break;
				}
			}
			if(!isDistinct){
				System.out.print(val[i]+" ");
			}
		}
	}
	
	public static void nonRepeatedElements(int[] val){
		//{5,2,7,2,4,7,8,2,3,100}
		int continuefro=0+1;
		for(int i=0;i<val.length;i++){
			boolean repeated=false;
			continuefro=i+1;
			for(int j=continuefro;j<val.length;j++){
				if(val[i]==val[j]){
					//System.out.print(val[i]+" ");
					continuefro=j+1;
					repeated=true;
					break;
				}
				continuefro=j+1;
			}
			if(!repeated){
			System.out.print(val[i]+" ");
			}
			
		}
	}
}
