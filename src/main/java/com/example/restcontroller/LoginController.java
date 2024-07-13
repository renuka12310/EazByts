package com.example.restcontroller;


	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class LoginController {

	    @PostMapping("/perform_login")
	    public String login(@RequestParam("username") String username,
	                        @RequestParam("password") String password) {
	        // Perform authentication logic here
	        // Return a success or error message
	        return "Authenticated";
	    }
	}

