package springBootExercise12.services;

import org.springframework.stereotype.Service;

@Service
public class BasicService {

	public String defaultGreeting() {
		return "Hello World!";
	}

	public String parameterGreeting(String name) {
		return "Hello " + name + "!";
	}

	public String hello(String name) {
		return String.format("Hello %s!", name);
	}
	
}