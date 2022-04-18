package com.udemy.java_course.junit_maven.test;
import org.junit.Test;

public class MyMathTest {
	
	@Test(expected = ArithmeticException.class)
	public void zeroDenominatorShouldThrowException() {
		MyMath.divide(1, 0);
	}
}
