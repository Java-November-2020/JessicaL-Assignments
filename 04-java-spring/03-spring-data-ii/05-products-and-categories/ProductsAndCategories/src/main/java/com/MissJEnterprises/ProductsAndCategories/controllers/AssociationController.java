package com.MissJEnterprises.ProductsAndCategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.MissJEnterprises.ProductsAndCategories.models.Association;
import com.MissJEnterprises.ProductsAndCategories.services.MainService;

@Controller
public class AssociationController {
	private final MainService mainService;
	public AssociationController(MainService service) {
		this.mainService = service;
	}
	@PostMapping("/associations/{kind}")
	public String Create(@Valid @ModelAttribute("association") Association association,
			BindingResult result,
			@PathVariable("kind") String kind) {
		if(result.hasErrors())
			return String.format("/%s/show.jsp", kind);
		mainService.createAssociation(association);
		return "redirect:/";
	}
}