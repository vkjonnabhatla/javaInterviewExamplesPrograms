package com.example;


public class Employee{

	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Double getExp() {
		return exp;
	}
	public void setExp(Double exp) {
		this.exp = exp;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	private Integer salary;
	private Double exp;
	private String city;
	private Integer age;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public Employee(){}
	@Override
	public String toString() {
		return name+":"+salary+":"+exp;
	}
	public Employee(String name, Integer salary,
			Double exp, String city,Integer age) {
		super();
		this.name = name;
		this.salary = salary;
		this.exp = exp;
		this.city=city;
		this.age=age;
	}

	public static void main(String[] args){
		
		Employee e = new Employee();
		System.out.println(e);
	}
}
