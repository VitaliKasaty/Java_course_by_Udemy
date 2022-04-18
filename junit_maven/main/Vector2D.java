package com.udemy.java_course.junit_maven.main;


public class Vector2D {
	private double x;
	private double y;
	
	public double length() {
		
		return Math.sqrt((x * x) + (y * y));
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

}
