package com.udemy.java_course.lambda_expressions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Hello");
		list.add("Goodbye");
		list.add("a");
		list.add("ab");
		
		//Cделаем два аналогичных варианта сортировки
		
		//вариант 1 через анонимный класс Comparator
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length()) {
					return 1;
				} else if (o1.length() < o2.length()) {
					return - 1;
				} else {
					return 0;
				}				
			}
		});
		
		//вариант 2 через лямбда-выражение
		list.sort((s1, s2) -> {
			if (s1.length() > s2.length()) {
				return 1;
			} else if (s1.length() < s2.length()) {
				return - 1;
			} else {
				return 0;
			}
		});
		
		//вариант 3 - написать экземпляр компаратора
		//который потом можно передать в метод sort()
		
		Comparator<String> comparator = (s1, s2) -> {
			if (s1.length() > s2.length()) {
				return 1;
			} else if (s1.length() < s2.length()) {
				return - 1;
			} else {
				return 0;
			}
		};		
		
		System.out.println(list);
	}
}