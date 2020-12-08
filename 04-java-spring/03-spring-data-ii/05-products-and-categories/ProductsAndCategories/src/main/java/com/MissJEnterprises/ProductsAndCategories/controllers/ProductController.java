package com.MissJEnterprises.ProductsAndCategories.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.MissJEnterprises.ProductsAndCategories.models.Association;
import com.MissJEnterprises.ProductsAndCategories.models.Category;
import com.MissJEnterprises.ProductsAndCategories.models.Product;
import com.MissJEnterprises.ProductsAndCategories.services.MainService;

@Controller
public class ProductController {
	private MainService mainService;
	public ProductController(MainService service) {
		this.mainService = service;
	}
	@GetMapping("/")
	public String Index(Model model) {
		model.addAttribute("products", mainService.findProducts());
		return "products/index.jsp";
	}
	@GetMapping("/{id}")
	public String Show(@ModelAttribute("association") Association association, 
		@PathVariable("id") Long id, Model model) {
		Product thisOne = mainService.getProduct(id);
		List<Category> others = mainService.findCategoriesNotInProduct(thisOne);
		model.addAttribute("product", thisOne);
		model.addAttribute("notInCategories", others);
		return "products/show.jsp";
	}
}