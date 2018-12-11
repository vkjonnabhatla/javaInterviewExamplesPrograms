package com.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.example.Customer;
import com.example.Employee;

public class Lambda{

	public static void main(String args[]){
		Employee e= new Employee();
		Customer c= new Customer();
		c.setName("jai");
		c.setAddress("Nagole");
//		e.setName("Jai");
//		e.setAddress("Hyd");
//		e.setDepartment("java");
//		e.setMobileNo("987");
//		ArrayList<Employee> al=new ArrayList<>();
//		al.add(e);
//		al.forEach(em -> System.out.println(em.getName() ));
		//FunctionInterface fi= (String name)->  new Employee(name,"HYD","java","998902");
		//System.out.println(fi.setEmp("Sathya").toString());
		FunctionInterface fi= (Customer cus)->{
			
			System.out.println(cus.getName()+"==="+cus.getAddress());
			return cus.getName()+cus.getAddress();
			
		};

		System.out.println(fi.bookReservation(c));
		
		
		// define list
//		List<String> al= Arrays.asList("java","streams","lamda");
//		al.forEach(S->System.out.println(S));
//		Integer i1= null;
//		Integer i2=new Integer(10);
//		Optional<Integer> o1=Optional.ofNullable(i1);
//		Optional<Integer> o2=Optional.of(i2);
//		System.out.println(sum(o1,o2));
		
	}
public static Integer sum(Optional<Integer> o1,Optional<Integer> o2){
	
	System.out.println("is value present:"+ o1.isPresent());
	System.out.println("is value present:"+ o2.isPresent());
	
	Integer val1=o1.orElse(0);
	Integer val2=o2.orElse(0);
	
	return val1+val2;
}

}
