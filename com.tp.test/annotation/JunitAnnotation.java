package annotation;

import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotation {
	
	// Execute before class
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}
	
	// Execute after class
	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}
	
	// Execute before test
	@Before
	public void before() {
		System.out.println("in before");
	}
	
	// Execute after test
	@After
	public void after() {
		System.out.println("in after");
	}
	
	// Test case
	@Test
	public void test() {
		System.out.println("in test");
	}
	
	// Test case ignore and will not execute
	@Ignore
	public void ignoreTest() {
		System.out.println("in ignore test");
	}
	

}
