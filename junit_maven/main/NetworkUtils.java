package com.udemy.java_course.junit_maven.main;


public class NetworkUtils {
	
	public static void getConnection() {
		//получаем соединение с сервером например
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

}
