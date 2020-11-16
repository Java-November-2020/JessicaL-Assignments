package com.MissJEnterprises.java.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SecondaryController {

	@RequestMapping("/dojo/{part1}")
	public String dojoCenter(@PathVariable("part1") String part1) {
		switch(part1) {
			case "dojo": 
				return "The Dojo is awesome!";
			case "burbank":
				return "Burbank Dojo is located in Southern California";
			case "san-jose":
				return "SJ dojo is the headquarters";
		}
		return " ";
	}

}
