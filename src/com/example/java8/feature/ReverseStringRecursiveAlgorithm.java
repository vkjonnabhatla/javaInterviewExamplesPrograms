package com.example.java8.feature;

public class ReverseStringRecursiveAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Reversed a string: "+reverseString("jaipal"));
	}
	
	private static String reverseString(String str){
		
		String reverse="";
		if(str.length()==1){
			return str;
		}else{
			reverse+= str.charAt(str.length()-1)+reverseString(str.substring(0, str.length()-1));
			return reverse;
		}
	}

}
