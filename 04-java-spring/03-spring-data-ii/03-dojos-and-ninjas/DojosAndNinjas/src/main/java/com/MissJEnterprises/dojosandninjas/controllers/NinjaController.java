package com.MissJEnterprises.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.MissJEnterprises.dojosandninjas.models.Ninja;
import com.MissJEnterprises.dojosandninjas.services.DojoService;

@Controller
public class NinjaController {
	private DojoService dService;
	public NinjaController(DojoService service) {
		this.dService = service;
	}
	@RequestMapping("/ninjas")
	public String Index(Model model) {
		model.addAttribute("ninjas", this.dService.allNinjas());
		return "/ninjas/ninjas_index.jsp";
	}
	
	@RequestMapping("/ninjas/new")
	public String New(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", this.dService.allDojos());
		return "/ninjas/new_ninjas.jsp";
	}
	@RequestMapping(value="/ninjas", method=RequestMethod.POST)
	public String Create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojos", this.dService.allDojos());
			return "/ninjas/new_ninjas.jsp";
		}
		this.dService.createNinja(ninja);
		return "redirect:/ninjas";
	}
}
