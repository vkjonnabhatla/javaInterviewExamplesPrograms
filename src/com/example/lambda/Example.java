package com.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.Employee;

public class Example {
	
	public static void main(String []args){
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(new Employee("Jai",5000,14.0,"Hyd",1));
		al.add(new Employee("Varun",10000,14.0,"Mumbai",1));
		al.add(new Employee("Karan",8000,5.8,"Hyd",1));
		al.add(new Employee("sallu",7000,6.8,"Banglore",1));
		System.out.println(al);
//		ArrayList<Employee> filtred=(ArrayList<Employee>)al.stream().filter(employee->employee.getExp()>10)
//		.collect(Collectors.toList());
//		System.out.println(filtred);
		al.forEach(e->System.out.println(e.getName()));
		ArrayList<Employee> filtred=(ArrayList<Employee>)al.stream()
				.filter(employee->employee.getCity().equals("Hyd"))
				.collect(Collectors.toList());
				System.out.println(filtred);
				
				System.out.println("=============================");
	
		Map<Double, List<Employee>> employeeMap = al.stream().collect(Collectors.groupingBy(Employee::getExp));
		//employeeMap.entrySet().stream().forEach(entry -> entry.getKey() + "\t" + entry.getValue().get);
		//Collectors.
		
		employeeMap.keySet().stream().forEach(key -> System.out.println( key + ":" + employeeMap.get(key)));
	}

}
