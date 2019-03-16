package log;

import junit.framework.TestCase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
public class LogTest extends TestCase {

	 static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	
	@Test
	public void test() {
		 logger.trace("trace message");
         logger.debug("debug message");
         logger.info("info message");
         logger.warn("warn message");
         logger.error("error message");
         logger.fatal("fatal message");
         System.out.println("Hello World!");
	}
}
