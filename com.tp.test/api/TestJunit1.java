package api;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestJunit1 {

	@Test
	public void testAdd() {
		
		// Test data
		int num = 5;
		String temp = null;
		String str = "Junit is working fine";
		
		// Check for equality
		assertEquals("Junit is working fine", str);
		
		// Check for false condition
		assertFalse(num > 6);
		
		// Check for not null value
		assertNotNull(str);
		
		// Check for null value
		assertNull(temp);
		
		// Check for not null value
		assertNotNull(temp);
	}
}
