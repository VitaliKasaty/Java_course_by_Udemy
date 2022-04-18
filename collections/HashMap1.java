package com.udemy.java_course.collections;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "odin");
		map.put(2, "dva");
		map.put(3, "tri");
		map.put(4, "odin");
		map.put(5, "dva");
		map.put(6, "tri");
		map.put(7, "odin");
		map.put(8, "dva");
		map.put(9, "tri");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}

	}

}