package springBootExercise12.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springBootExercise12.services.BasicService;

@RestController
public class Controller {
	
	@Autowired
	BasicService basicService;
	
	@GetMapping("/")
	public String defaultGreeting() {
		return "Hello World!";
	}
	
	@GetMapping("/{name}")
	public String parameterGreeting(@PathVariable(name="name") String name) {
	    return basicService.parameterGreeting(name);
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return basicService.hello(name);
	}
	

}
