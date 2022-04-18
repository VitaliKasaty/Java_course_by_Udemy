package com.udemy.java_course.junit_maven.test;
import org.junit.Before;
import org.junit.Test;


import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Vector2DTestNew {
	private final double EPS = 1e-9;
	private static Vector2D v1;
	
	@Before
	public static void createNewVector() {
		v1 = new Vector2D();
	}
	
	@Test
	public void newVectorShouldHaveZeroLength() {		
		Assert.assertEquals(0, v1.length(), EPS);
	}
	
	@Test
	public void newVectorShouldHaveZeroX() {		
		Assert.assertEquals(0, v1.getX(), EPS);
	}
	
	@Test
	public void newVectorShouldHaveZeroY() {		
		Assert.assertEquals(0, v1.getY(), EPS);
	}	

}
