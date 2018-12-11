package com.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.example.Employee;

public class ImplClass {


public static void main(String []args){
	
//	Interface2 i2=()->{
//		System.out.println("this is I2");
//		return "Jai";
//	};
//	System.out.println(i2.toString());
//	ImplClass ic= new ImplClass();
	
	
	List<Employee> al=new ArrayList<Employee>();
	al.add(new Employee("Jai",5000,5.2,"hyd",1));
	al.add(new Employee("Varun",10000,3.4,"bang",1));
	al.add(new Employee("Karan",7000,5.8,"mumbai",1));
	
	System.out.println(al);
	
	Predicate<Employee> p=e->e.getSalary()<10000 && e.getExp()>3.5;
	for(Employee e: al){
		if(p.test(e)){
			e.setSalary(e.getSalary()+2000);
		}
	}
	System.out.println(al);
}


}
