package com.udemy.java_course.junit_maven.test;
import org.junit.Test;


public class NetworkUtilsTest {
	
	@Test(timeout = 1000)
	public void getConnectionShouldReturnFasterThanOneSecond() {
		NetworkUtils.getConnection();
	}

}
