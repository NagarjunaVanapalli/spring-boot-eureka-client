package com.springboot.nag;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/springboot")
	public String springBoot() {
		return "Hello, Spring Boot service is running . . .";
	}

}
