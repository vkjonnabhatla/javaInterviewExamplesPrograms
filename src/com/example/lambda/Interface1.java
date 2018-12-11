package com.example.lambda;
public interface Interface1 {

	int method();
	default void log1(){
		System.out.println("I1 log");
	}
}
