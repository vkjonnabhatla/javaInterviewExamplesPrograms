package com.example.java8.feature;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxAndMinValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] i={1,100,100,50};
		findMaxAndMinValues(i);

	}


	public static void findMaxAndMinValues(Integer[] array){

		List<Integer> li=Arrays.asList(array);
		System.out.println("The Min value in the array is: "+li.stream().mapToInt(v->v).min().orElseThrow(NoSuchElementException::new));
		System.out.println("The Max value in the array is: "+li.stream().mapToInt(v->v).max().orElseThrow(NoSuchElementException::new));

	}

}
