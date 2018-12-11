package com.example.lambda;

import com.example.Customer;
@FunctionalInterface
public interface FunctionInterface {


	String bookReservation(Customer cust);
	public static void getCutomerData(){
		
	}
   public static void getCutomerInfo(){
		
	}
   public default void getCustomerName(){
	   
   }
 public default void getCustomerBackUp(){
	   
   }
	
}
