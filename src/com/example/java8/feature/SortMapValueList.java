package com.example.java8.feature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.Items;

public class SortMapValueList {

	
	//Sorting map based on value value is List of Items 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,List<Items>> map=
				new HashMap<String,List<Items>>();
		List<Items> il1= new ArrayList<>();
		il1.add(new Items("Telvision", 13000.0));
		il1.add(new Items("Sofa", 11000.0));
		
		List<Items> il2= new ArrayList<>();
		il2.add(new Items("Refrigirator", 15000.0));
		il2.add(new Items("Oven", 7000.0));
		
		List<Items> il3= new ArrayList<>();
		il3.add(new Items("WashingMachine", 19000.0));
		il3.add(new Items("Chairs", 19000.0));
		
		List<Items> il4= new ArrayList<>();
		il3.add(new Items("Mobile", 1000.0));
		il3.add(new Items("Book", 14000.0));
		il4.add(null);


map.put("1146", il1);
map.put("1147", il2);
map.put("1148", il3);

sortMapByValuesAreListOfItems(map);
	}
	
	public static  Stream<List<Items>> checkNull(Map<String, List<Items>> coll){
		
		return coll.values().stream();
		//return Optional.ofNullable(coll).map(v->v.values().stream().findAny());
		
	}
	
	public static void sortMapByValuesAreListOfItems(Map<String, List<Items>> map){
		
		System.out.println("Before Sorting---"+map);
		Comparator<Items> com=(item1,item2)->item1.getItemName().compareTo(item2.getItemName());
		Map<String, List<Items>> result=
		map.entrySet().stream()
		.collect(Collectors.toMap(Map.Entry::getKey, v->v.getValue()
				.stream().sorted(com).collect(Collectors.toList())));
		System.out.println("After sorting----"+result);
	}
}
