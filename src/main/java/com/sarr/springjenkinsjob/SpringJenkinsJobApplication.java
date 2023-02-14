package com.sarr.springjenkinsjob;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsJobApplication {
public static Logger logger = LoggerFactory.getLogger(SpringJenkinsJobApplication.class);


	@PostConstruct
	public void init(){
		logger.info("Application started....");
	}
	public static void main(String[] args) {
				logger.info("Application executed....");

		SpringApplication.run(SpringJenkinsJobApplication.class, args);
	}

}
