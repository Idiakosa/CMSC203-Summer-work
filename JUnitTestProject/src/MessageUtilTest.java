import org.junit.jupiter.api.Test;
import messageUtilTest.MessageUtil;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageUtilTest {
	
	   String message = "Hello World";	
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {
	      assertEquals(message,messageUtil.printMessage());
	   }
	}