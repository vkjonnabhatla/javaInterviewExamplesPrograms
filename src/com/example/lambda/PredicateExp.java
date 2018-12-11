package com.example.lambda;

import java.util.function.Predicate;

public class PredicateExp {

	public static void main(String[] args){
		
		int[] x={0,5,10,15,20,25,30};
		Predicate<Integer> p1= I->I>10;
		Predicate<Integer> p2= I->I%2==0;
		check(p2,x);
	}
	public static void check(Predicate<Integer> p,int[] x){
		for(Integer i:x){
			if(p.test(i)){
				System.out.println(i);
			}
		}
		
	}
}
