package com.example.java8.feature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortMapByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		Map<String, Integer> m=new HashMap<String, Integer>();
		m.put("jai", 1);
		m.put("salman", 10);
		m.put("shiva", 55);
		m.put("varun", 2);
		sortMapByValue(m);
//		//Map<String, Integer> sorted=
//				m.entrySet().stream()
//				.sorted(Map.Entry.<String,Integer>
//				comparingByValue((i1,i2)->i2.compareTo(i1)))
//				.forEachOrdered(System.out::println);
				
				//m.forEach((k,v)->System.out.println(v.c));
		
	}
	
	public static void sortMapByValue(Map<String, Integer> m){
		
		m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
