package com.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
	
	//http://localhost:9080/api-v1/ping
	@GetMapping("/ping")
	public String ping() {
		return "API Is Started.";
	}

}
