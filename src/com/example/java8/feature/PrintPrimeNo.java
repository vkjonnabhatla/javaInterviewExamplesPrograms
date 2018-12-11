package com.example.java8.feature;

public class PrintPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//printPrimeNumbers(21);
		sumOfPrimeNumbers(1000);
		
	}
	
	private static boolean isPrime(int number){
		
		//System.out.println("val--"+number/2);
		  for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
	
    private static void printPrimeNumbers(int number){
	
    	for(int i=1;i<=number;i++){
    		if(isPrime(i)){
    			System.out.print(i+",");
    		}
    	}
    }
    private static void sumOfPrimeNumbers(int num){
    	
    	int sum=0;
    	for(int i=2;i<num;i++){
    		if(isPrime(i))
    			sum+=i;
    	}
    	System.out.println(sum);
    }
}
