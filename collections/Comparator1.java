package com.udemy.java_course.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {
	
	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<>();		
		animals.add("cat");
		animals.add("dog");
		animals.add("asdfgth");
		animals.add("bird");
		animals.add("frog");
		animals.add("a");		
		Collections.sort(animals, new StringLengthComparator());
		System.out.println(animals);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(0);
		numbers.add(100);
		numbers.add(77);
		Collections.sort(numbers, new BackwardsIntegerComparator()); //сортировка через класс имплементирующий компаратор
		System.out.println(numbers);
		
		Collections.sort(numbers, new Comparator<Integer>() { // через анонимный класс
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return 1;
				} else if (o1 < o2) {
					return -1;
				} else {
					return 0;
				}				
			}
			
		});		
		System.out.println(numbers);
		
		Collections.sort(numbers, (o1, o2) -> {	//через лямбду	
				if (o1 > o2) {
					return 1;
				} else if (o1 < o2) {
					return -1;
				} else {
					return 0;
				}
			
		});
		System.out.println(numbers);
	}
}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		if (o1.length() > o2.length()) {
			return 1;
		} else if (o1.length() < o2.length()) {
			return -1;
		} else {
			return 0;
		}
	}	
}

class BackwardsIntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		if (o1 > o2) {
			return -1;
		} else if (o1 < o2) {
			return 1;
		} else {
			return 0;
		}		
	}	
}