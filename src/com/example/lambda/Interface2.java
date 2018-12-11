package com.example.lambda;

public interface Interface2 {

	 String toString1();
	 //String toString2();
	//void method5();
	default void log2(){
		System.out.println("I2 log");
	}
}
