package com.udemy.java_course.collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			arrayList.add(i);
		}
		//arrayLists.add(1)
		System.out.println(arrayList);
		
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(99));

	}

}
