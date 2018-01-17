package executing_tests;

/*
 * This class prints the given message on console.
 */
public class MessageUtil {

	private String message;
	
	// Constructor
	// @param message to be printed
	public MessageUtil(String message) {
		this.message = message;
	}
	
	// Prints the message
	public String printMessage() {
		System.out.println(message);
		
		return message;
	}
}
