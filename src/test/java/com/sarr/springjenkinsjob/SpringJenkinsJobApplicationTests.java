package com.sarr.springjenkinsjob;
import org.slf4j.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsJobApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsJobApplication.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing....");
		logger.info("Test case executing second log statement....");

		assertEquals(true, true);
	}

}
