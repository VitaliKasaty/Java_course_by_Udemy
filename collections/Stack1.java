package com.udemy.java_course.collections;
import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(5);
		stack.push(3);
		stack.push(1);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}