package com.udemy.java_course.regexp;
import java.util.Arrays;

public class SplitReplace {
	
	public static void main(String[] args) {
		
		String a = "Hello345345there654654hey5454654gfd";
		String[] words = a.split("\\d+");
		System.out.println(Arrays.toString(words));
		
		String b = "Hello there hey";
		String modifiedStringB = b.replace(" ", ".");
		System.out.println(modifiedStringB);
		
		String c = "Hello34534there2343243hey";
		String modifiedStringC = c.replaceAll("\\d+", "-");		
		System.out.println(modifiedStringC);
		
		String d = "Hello34534there2343243hey";
		String modif = d.replaceFirst("\\d+", "-");
		System.out.println(modif);

	}
}
