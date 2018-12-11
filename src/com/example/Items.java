package com.example;

public class Items{
	
	private String itemName;
	private Double itemPrice;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Items(){
	}

	public Items(String itemName,Double price){
		this.itemName=itemName;
		this.itemPrice=price;
	}
	public String toString(){
		
		return itemName+" "+itemPrice;
	}
	
	public boolean equals(Object obj){
		
		if(obj instanceof Items){
			Items i=(Items)obj;
			return (this.itemName.equals(i.getItemName()));
		}
		return false;
	}
	
	public int hashCode(){
		
		//Double hashcode=this.itemPrice*32;
		//hashcode+=this.itemName.hashCode();
		return this.itemName.hashCode();
	}
}
