package com.udemy.java_course.collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCodeEquals {
	
	public static void main(String[] args) {
		
		Map<Person, String> map = new HashMap<>();
		Set<Person> set = new HashSet<>();
		
		Person person1 = new Person(1, "Mike");
		Person person2 = new Person(1, "Mike");
		
		map.put(person1, "123");
		map.put(person2, "123");
		
		set.add(person1);
		set.add(person2);
		
		System.out.println(map);
		System.out.println(set);
		
//		map.put(1, "Один");
//		map.put(1, "Другое значение");
//		
//		set.add(1);
//		set.add(1);
//		
//		System.out.println(map);
//		System.out.println(set);	

	}
}

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {			
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}	
	
}