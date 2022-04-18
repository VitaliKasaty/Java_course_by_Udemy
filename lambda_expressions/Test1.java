package com.udemy.java_course.lambda_expressions;


interface Executable {
	int execute();
}

class Runner {
	public void run(Executable e) {
		int a = e.execute();
		System.out.println(a);
	}
}

public class Test1 {
	
	public static void main(String[] args) {
		
		Runner runner = new Runner();		 
		
		runner.run(new Executable() {			
			@Override
			public int execute() {				
				System.out.println("Hello");
				System.out.println("Goodbye");
				return 1;
			}
		});
		
		runner.run(() -> {
			
		System.out.println("Hello");
		System.out.println("Goodbye");
		
		return 5;
		});		
	}
}		
		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override                           //вариант 1
//			public void run() {				
//				System.out.println("Hello");
//			}
//		});
//		
//		//аналогичный вариант 2
//		Thread thread1 = new Thread(() -> System.out.println("Hello"));
