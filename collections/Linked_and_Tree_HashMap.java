package com.udemy.java_course.collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Linked_and_Tree_HashMap {
	
	public static void main(String[] args) {
			
		Map<Integer, String> hashMap = new HashMap<>(); //внутри не гарантируется порядок хранения элементов
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //порядок согласно добавлению
		
		Map<Integer, String> treeMap = new TreeMap<>(); //элементы в мапе отсортированы по ключу
		
		System.out.println("В HashMap нет порядка элементов");
		testMap(hashMap);
		
		System.out.println("\nВ LinkedHashMap порядок в соответствии с добавлением");
		testMap(linkedHashMap);
		
		System.out.println("\nВ linkedHashMap элементы отсортированы по ключу в natural ordering");
		testMap(treeMap);
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(39, "Bob");
		map.put(12, "Nike");
		map.put(78, "Tom");
		map.put(0, "Tim");
		map.put(1500, "Lewis");
		map.put(7, "Bob");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
	}

}