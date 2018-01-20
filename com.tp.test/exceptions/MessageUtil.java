package exceptions;


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
		
		  // Arithmetic Exception here
	      int a = 0;
	      int b = 1/a;
	
		return message;
	}
	
	// add "Hi!" to the message
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		
		return message;
	}
}
