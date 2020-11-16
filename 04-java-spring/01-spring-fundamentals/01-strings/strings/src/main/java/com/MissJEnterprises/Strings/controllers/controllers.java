package com.MissJEnterprises.Strings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllers {
	
		@RequestMapping("/")
			public String home() {
			return "Welcome to the Root";
		}
		@RequestMapping("/randomness")
			public String randomness() {
				return"Welcome to the Randomness";
			}
			
		
}
