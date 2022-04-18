package com.udemy.java_course.regexp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	
	public static void main(String[] args) {
		String text = "Hello, Guys! I send you my email joe@gmail.com so we can\n" +
				"keep in touch. Thanks, Joe! That's cool. I am sending you\n" +
				"my adress: tim@yandex.ru. Let's stay in touch...";
		
		Pattern email = Pattern.compile("\\w+@\\w+\\.\\w+");
		Matcher matcher = email.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		Pattern email1 = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
		Matcher matcher1 = email1.matcher(text);
		
		while(matcher1.find()) {
			System.out.println(matcher1.group(3));
		}
	}

}