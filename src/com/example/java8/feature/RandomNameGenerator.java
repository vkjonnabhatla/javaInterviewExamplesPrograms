package com.example.java8.feature;

import java.util.ArrayList;
import java.util.function.Supplier;

public class RandomNameGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> s=()->{
		ArrayList<String> al= new ArrayList<String>();
		al.add("Jai");
		al.add("Varun");
		al.add("Shiva");
		al.add("Sriram");
		al.add("Salman");
			//String[] s1={"Jai","varun","Salman","Karan"};
		int x= (int)(Math.random()*al.size());
		return al.get(x);
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

	
}
