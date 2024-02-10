package com.infy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public String welcome() {
		return "<h1> Welcome to the application! </h1>";
	}

	@GetMapping("/admin")
	public String adminOnly() {
		return "<h1> Welcome to the application, admin! </h1>";
	}

	@GetMapping("/user")
	public String userOnly() {
		return "<h1> Welcome to the application, user !!! </h1>";
	}

}
