package com.udemy.java_course.junit_maven.test;
import org.junit.Test;


import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Vector2DTest {
	private final double EPS = 1e-9;
	
	
	@Test
	public void newVectorShouldHaveZeroLength() {
		Vector2D v1 = new Vector2D(); //action		
		//assertion
		Assert.assertEquals(0, v1.length(), EPS);
	}
	
	@Test
	public void newVectorShouldHaveZeroX() {
		Vector2D v1 = new Vector2D(); //action		
		//assertion
		Assert.assertEquals(0, v1.getX(), EPS);
	}
	
	@Test
	public void newVectorShouldHaveZeroY() {
		Vector2D v1 = new Vector2D(); //action		
		//assertion
		Assert.assertEquals(0, v1.getY(), EPS);
	}
	
	

}
