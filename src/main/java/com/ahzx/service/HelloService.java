package com.ahzx.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
	@GetMapping("hello.action")
	public String hello(){
		return "hello Spring Boot";
	}
}
