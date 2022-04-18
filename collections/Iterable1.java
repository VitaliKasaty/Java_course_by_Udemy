package com.udemy.java_course.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Iterable1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}	

	}

}