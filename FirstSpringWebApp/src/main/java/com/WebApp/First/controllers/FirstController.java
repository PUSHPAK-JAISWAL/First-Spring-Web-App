package com.WebApp.First.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class FirstController {
	
	
	@GetMapping
	public String getHello() {
		return "Hello World from Spring Web Application HomePage";
	}
	
	
	@GetMapping("search")
	public String getHelloWorld() {
		return "Hello World from Spring Web Application";
	}
	
	@GetMapping("searching")
	public String query(@RequestParam(name = "q") String value) {
		return value;
	}
	
	@GetMapping("searching1/{q}")
	public String queryPath(@PathVariable(name = "q") String value) {
		return value;
	}
	
	@PostMapping(path = "post")
	public void postmap() {
		System.out.println("Running post");
	}
}
