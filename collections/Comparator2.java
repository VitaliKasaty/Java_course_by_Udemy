package com.udemy.java_course.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator2 {
	
	public static void main(String[] args) {
		
		List<Persone> people = new ArrayList<>();
		people.add(new Persone(1, "Bob"));
		people.add(new Persone(2, "Katty"));
		people.add(new Persone(3, "Mike"));
		
		System.out.println(people);
		Collections.sort(people, new Comparator<Persone>() {
			@Override
			public int compare(Persone o1, Persone o2) {
				if(o1.getName().length() > o2.getName().length()) {
					return 1;
				} else if (o1.getName().length() < o2.getName().length()) {
					return -1;
				} else {
					return 0;
				}				
			}
		});
		System.out.println(people);
	}

}

class Persone {
	private int id;
	private String name;
	
	public Persone(int id, String name) {		
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
