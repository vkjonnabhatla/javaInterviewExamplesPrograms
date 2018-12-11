package com.example;

public class MobileNumbers {

	private String mobileNo;
	private String operator;
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
  public MobileNumbers(String mobileNo,String operator){
	  
	  this.mobileNo=mobileNo;
	  this.operator=operator;
  }
  
  @Override
	public String toString() {
		return mobileNo+":"+operator;
	}
  
  //Comparable<MobileNumbers> comp=(MobileNumbers num)->
}
