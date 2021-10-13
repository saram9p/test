package com.example.mongoapp.web;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	// A가 작업
	@GetMapping("/")
	public void user() {
		
	}
	
	// B가 작업 
	@GetMapping("/board")
	public void board() {
		
	}
}
