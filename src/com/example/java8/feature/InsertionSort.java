package com.example.java8.feature;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        insertionSort(input);
	}
	
    private static void printNumbers(int[] input) {
        
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
 
    public static void insertionSort(int array[]) {

    	int temp1=0,temp2;
    	for(int i=0;i<array.length;i++){
    		for(int j=i+1;j<array.length;j++){
    			if(array[i]>array[j]){
    				
    				temp1=array[i];
    				temp2=array[j];
    				array[j]=temp1;
    				array[i]=temp2;
    			}
    		}
    	}
    	printNumbers(array);
    }

}
