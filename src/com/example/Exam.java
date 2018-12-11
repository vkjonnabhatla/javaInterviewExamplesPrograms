package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam {

	private int x=6,y;
	static int z=2;
//	static{
//		z=40;
//		System.out.println("I am static");
//	}
//	{
//		System.out.println("I am instance");
//	}
	
	static String pattern = "^((?=[A-Za-z0-9@])(?![_\\\\-]).)*$";
	public static void m1(String st){
		//System.out.println(st.matches(pattern));

String sDate1="201202291325";  
    if( sDate1.length() ==12 && sDate1.matches("[0-9]+")) {
    System.out.println("perfect number::");
    try {
Date date1 = new SimpleDateFormat("yyyyMMddHHmm").parse(sDate1);
System.out.println(sDate1+"\t"+date1); 
} catch (ParseException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} 
    } else {
    System.out.print("missing conditions number::");
    }
	}
	
	
	Exam(){
		System.out.println("I am constru");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Exam e= new Exam();
m1("");
	}

}
