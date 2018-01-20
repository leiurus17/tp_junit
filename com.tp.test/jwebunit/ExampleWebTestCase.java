package jwebunit;

import org.junit.Test;

import junit.framework.TestCase;
import net.sourceforge.jwebunit.WebTester;

public class ExampleWebTestCase extends TestCase {

	private WebTester tester;
	
	public ExampleWebTestCase(String name) {
		super(name);
		tester = new WebTester();
	}
	
	// Set base URL
	public void setUp() throws Exception {
		tester.getTestContext().setBaseUrl("https://www.google.com.ph");
	}
	
	// Test base info
	@Test
	public void testInfoPage() {
		tester.beginAt("/intl/en_ph/policies/terms/regional.html");
	}
	
	
}
