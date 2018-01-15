package execution_procedure;

import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Ignore;
import org.junit.Test;

public class ExecutionProcedureUnit {

	// Execute only once, in the start
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}
	
	// Execute only once, in the end (it doesn't even matter)
	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}
	
	// Execute for each test, before executing test
	@Before
	public void before() {
		System.out.println("in before");
	}
	
	// Execute for each test, after executing test
	@After
	public void after() {
		System.out.println("in after");
	}
	
	// Test Case 1
	@Test
	public void testCase1() {
		System.out.println("in test case 1");
	}
	
	// Test Case 2
	@Test
	public void testCase2() {
		System.out.println("in test case 2");
	}
	
}
