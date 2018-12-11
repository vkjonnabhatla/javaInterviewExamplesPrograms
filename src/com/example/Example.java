package com.example;

import java.util.Map;

public class Example {

	public static int reverse(int num){
		int reverse=0;
		while(num!=0){
			reverse=(reverse*10)+(num%10);
			num=num/10;
		}
		return reverse;
	}
	
	public static String reverseRecrusive(String value){
		String reverse="";
		if(value.length()==0){
			return value;
		}else{
			reverse+=value.charAt(value.length()-1)+
					reverseRecrusive(value.substring(0, value.length()-1));
			return reverse;
		}
		
	}
	public static void findPerfect(int num){
		int temp=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0){
			temp+=i;
			}
		}
		if(temp==num){
			System.out.println(temp+": is perfect");
		}else{
			System.out.println(temp+": is not");
		}
	}
	
	public static void findDuplicates(String str){
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					System.out.print(ch[j]+",");
				}
			}
			
		}
	}
	
	public static void sortByValue(Map<String,Integer> map){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(reverse(3)+"=====");
          System.out.println(reverseRecrusive("J"));
          findPerfect(6);
          findDuplicates("JAIIIPP");
          
//          Gson gson = new Gson();
//          NameList nameList = gson.fromJson(data, NameList.class);
          
          String str= "{PMOTN_CDS=['JavaScript', 'ES2015', 'JSON']}".replace("=", ":");
       
      
			System.out.println(str);
			dup();
	}
	static void dup(){
	int[] arr=new int[] {1,2,2,1,3};
	//int i1=0;
	int[] arr1=new int[4];
	for(int i=0;i<arr.length;i++){
	    for(int j=i+1;j<arr.length;j++){
	        if(arr[i]==arr[j]){
	     System.out.println("No.of Times repeated"+arr[j]+"=="+arr[i]);
	      //continue;
	        }
	    }
	}
	}

}
