package com.example.lambda;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.MobileNumbers;

public class StreamExp {

	public static void main(String[] args){
		
		ArrayList<MobileNumbers> al= new ArrayList<>();
		al.add(new MobileNumbers("9618885998", "airtel"));
		al.add(new MobileNumbers("9542480184", "idea"));
		al.add(new MobileNumbers("9618885999", "bsnl"));
		al.add(new MobileNumbers("9618855999", "airtel"));
		al.add(new MobileNumbers("9618865999", "bsnl"));
		al.add(new MobileNumbers("9618485999", "idea"));
		
		System.out.println(al);
//		ArrayList<MobileNumbers> filtered=(ArrayList<MobileNumbers>) al.stream()
//				.filter(mobile->mobile.getOperator()
//				.equals("bsnl")).collect(Collectors.toList());
//		System.out.println(filtered);
		
		ArrayList<MobileNumbers> sorted=(ArrayList<MobileNumbers>) al.stream()
				.sorted().collect(Collectors.toList());
		
	}
}
