package com.example.java8.feature;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args){
		int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
		//List<Integer> al=Stream.of(input1).distinct().collect(Collectors.toList());
	
		int[] input2 = Arrays.stream(input1)
	    .distinct()
	    .toArray();
		for(int val:input2){
			System.out.print(val+",");
		}
		
		
	}
}
