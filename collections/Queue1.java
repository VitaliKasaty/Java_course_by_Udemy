package com.udemy.java_course.collections;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue1 {
	public static void main(String[] args) {
		
		Human human1 = new Human(1);
		Human human2 = new Human(2);
		Human human3 = new Human(3);
		Human human4 = new Human(4);
		
		Queue<Human> people = new ArrayBlockingQueue<Human>(10);
		people.add(human3);
		people.add(human2);
		people.add(human4);
		people.add(human1);
		
		System.out.println(people.remove());
		for (Human human : people) {
			System.out.println(human);
		}
	}

}

class Human {
	private int id;

	public Human(int id) {		
		this.id = id;
	}

	@Override
	public String toString() {
		return "Human [i=" + id + "]";
	}
}
