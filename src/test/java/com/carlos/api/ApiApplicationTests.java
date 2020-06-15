package com.carlos.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@DisplayName("ApiApplicationTests")
@SpringBootTest
public class ApiApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(ApiApplicationTests.class);

	@Test
	@DisplayName("The method to contectLoads Test")
	public void runApplication() {
	}

}
