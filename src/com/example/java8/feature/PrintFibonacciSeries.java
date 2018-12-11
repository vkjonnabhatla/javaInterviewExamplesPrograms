package com.example.java8.feature;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fibonacci = 15;
		int[] series=new int[fibonacci];
		series[0]=0;
		series[1]=1;
		for(int i=2;i<series.length;i++){
			series[i]=series[i-1]+series[i-2];
		}
		
		 for(int i=0; i< fibonacci; i++){
             System.out.print(series[i] + " ");
     }
	}

}
