package time;

import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class TestJunit1 {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test(timeout = 1000)
	public void testPrintMessage() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}

}
