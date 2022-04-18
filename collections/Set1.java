package com.udemy.java_course.collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
	
	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		hashSet.add("Mike");
		hashSet.add("Katy");
		hashSet.add("Tom");
		hashSet.add("George");
		hashSet.add("Donald");
		
		for(String name : linkedHashSet) {
			System.out.println(name);
		}
	}

}