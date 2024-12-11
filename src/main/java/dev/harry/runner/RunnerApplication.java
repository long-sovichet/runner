package dev.harry.runner;

import java.lang.invoke.TypeDescriptor.OfField;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RunnerApplication {

	// public static void main(String[] args) {
	// 	SpringApplication.run(RunnerApplication.class, args);

	// 	var welcomeMessage = new WelcomeMessage();
	// 	System.out.println(welcomeMessage.getWelcomeMessage());
	private static final Logger log = LoggerFactory.getLogger(RunnerApplication.class);
	public static void main(String[] args){
		SpringApplication.run(RunnerApplication.class, args);
		log.info("Application started successfully");
	}
}
	
