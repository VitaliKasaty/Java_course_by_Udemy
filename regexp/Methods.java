package com.udemy.java_course.regexp;

public class Methods {
	
	public static void main(String[] args) {
		
		/*
		 * \\d - одна цифра
		 * + - 1 или более раз
		 * * - 0 или более раз
		 * (x | y | z) - одна строка из множества строк
		 * 
		 */
		
		String a = "-5363";
		String b = "41241";
		String c = "+2423";
		
		System.out.println(c.matches("(-|\\+)?\\d+"));
		
		String d = "31t11gf3ASDdff33311313113132443253";
		System.out.println(d.matches("[a-zA-Z31]+\\d+"));
		
		String e = "heallco";
		System.out.println(e.matches("[^abc]*"));
		
		String url1 = "http://www.google.com";
		String url2 = "http://www.yandex.ru";
		String url3 = "Hello there";
		System.out.println(url1.matches("http://www\\..+\\.(com|ru)"));
		System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
		System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
		
		String f = "12343434";
		System.out.println(f.matches("\\d{2,}"));

	}	

}