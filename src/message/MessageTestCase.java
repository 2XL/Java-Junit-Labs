package message;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Simple Test Case to assert the correctness
 * of the printMessage method of the MessageUtil class.
 */
public class MessageTestCase {
	
	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		message = "New Word";
		assertEquals(message, messageUtil.printMessage());
	}
	
	
}
