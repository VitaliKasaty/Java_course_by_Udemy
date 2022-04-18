package com.udemy.java_course.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Comporable1 {
	public static void main(String[] args) {
		
		List<Persona> peopleList = new ArrayList<>();
		Set<Persona> peopleSet = new TreeSet<>();
		
		
		addElements(peopleList);
		addElements(peopleSet);
		
		Collections.sort(peopleList);
		
		System.out.println(peopleList);
		System.out.println(peopleSet);

	}
	
	private static void addElements(Collection<Persona> collection) {
		collection.add(new Persona(561, "Bob"));
		collection.add(new Persona(29, "William"));
		collection.add(new Persona(342, "Andy"));
		collection.add(new Persona(4, "Yo"));
		
	}

}

class Persona implements Comparable<Persona>{
	private int id;
	private String name;
	
	public Persona(int id, String name) {		
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
		Persona other = (Persona) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Persona o) {
		if (this.id > o.getId()) {
			return 1;
		} else if (this.id < o.getId()) {
			return -1;
		} else {
			return 0;
		}
		
	}
	
}
