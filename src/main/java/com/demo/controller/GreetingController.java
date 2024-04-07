package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
	
//	@GetMapping("/greeting")
//	public String greeting(Model model) {
//		Map<String,String> m=new HashMap();
//		m.put("message", "Hello Mayank");
//		model.addAttribute("map", m);
//		return "greeting";
//	}

	@GetMapping("/greeting")
	public String greeting(Map<String,String> m) {
		
		m.put("message", "Hello Mayank");
		return "greeting";
	}
}
