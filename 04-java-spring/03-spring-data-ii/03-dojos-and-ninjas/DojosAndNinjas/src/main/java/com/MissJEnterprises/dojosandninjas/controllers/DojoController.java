package com.MissJEnterprises.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.MissJEnterprises.dojosandninjas.models.Dojo;
import com.MissJEnterprises.dojosandninjas.services.DojoService;

@Controller
public class DojoController {
	private final DojoService dService;
	public DojoController(DojoService service) {
		this.dService = service;
	}
	@RequestMapping("/dojos")
	public String Index(Model model) {
		model.addAttribute("dojos", dService.allDojos());
		return "/index.jsp";
	}
	@RequestMapping("/dojos/{id}")
	public String Show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", this.dService.findDojo(id));
		return "show.jsp";
	}
	@RequestMapping("/dojos/new")
	public String New(@ModelAttribute("dojo") Dojo dojo) {
		return "add_dojo.jsp";
	}
	@RequestMapping(value="/dojos", method=RequestMethod.POST)
	public String Create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors())
			return "add_dojo.jsp";
		this.dService.createDojo(dojo);
		return "redirect:/dojos";
	}
}