package com.bassam.test.webservices.restfulwebservices.halloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloWorldController {
	
	@RequestMapping(method = RequestMethod.GET , path = "/hello-world")
	public String helloWorld() {
		return "Hello Worid";
	}

	@RequestMapping(method = RequestMethod.GET , path = "/hello-world-bean")
	public HalloWorldBean helloWorldBean() {
		return new HalloWorldBean("Hello World");
	}
	
	@GetMapping(path = "/hello-world/path-varible/{name}")
	public HalloWorldBean halloWorldBeanPath(String name) {
		return halloWorldBeanPath(String.format("Hallo world , %s " , name));
	}
}

