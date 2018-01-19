package ignore;

import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;


// You can put @Ignore here
public class TestJunit1 {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}

}
