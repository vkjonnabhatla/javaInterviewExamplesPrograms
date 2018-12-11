package com.example.java8.feature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.Employee;
import com.example.Items;

public class SortMapValuesWithListOfEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,List<Employee>> map=
				new HashMap<String,List<Employee>>();
		List<Employee> e1= new ArrayList<>();
		e1.add(new Employee("Jai", 13000,3.5,"Hyd",26));
		e1.add(new Employee("varun", 20000,7.0,"Mubai",28));
		e1.add(new Employee("Krish", 17000,3.5,"Banglore",26));
		e1.add(new Employee("Suman", 18000,5.0,"Mubai",28));
		e1.add(new Employee("Salman", 15000,4.5,"Hyd",26));
		e1.add(new Employee("Venkey", 14000,6.0,"Banglore",26));
		
		List<Employee> e2= new ArrayList<>();
		e2.add(new Employee("Jai", 13000,3.5,"Hyd",27));
		e2.add(new Employee("varun", 20000,7.0,"Mubai",27));
		
	
		map.put("Nisum", e1);
		//map.put("US", e1);
		
		System.out.println(map);
		Comparator<Employee> employeeComapre= (i1,i2)->
		   i1.getExp().compareTo(i2.getExp());
		   

//		   Map<String, Map<String,List<Employee>>> map1=  (Map<String, Map<String,List<Employee>>>)map.entrySet()
//				   .stream().collect(Collectors.
//						   toMap(Map.Entry::getKey, v->v.getValue().stream()
//								   .sorted(employeeComapre)
//								   .collect(Collectors.groupingBy(Employee::getCity))));
				   
				   
		   Map<String,List<Employee>> m= map.values().stream().flatMap(List::stream)
				   .collect(Collectors.toList()).stream().sorted(employeeComapre).distinct()
				   .collect(Collectors.groupingBy(Employee::getCity));
						      
		   
		   
		   System.out.println(m);
	}
	

}
