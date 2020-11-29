package com.MissJEnterprises.cars.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.MissJEnterprises.cars.models.Car;
import com.MissJEnterprises.cars.services.CarService;

@Controller
public class CarController {
		//dependency injection shorthand, see APICarController for the long version
	@Autowired
	private CarService cService;
	
	@GetMapping("/")
	public String index(Model viewModel) {
		List<Car> allCars = this.cService.getAllCars();
		viewModel.addAttribute("allCars", allCars);
		return "index.jsp";
	}
	
	@GetMapping("/add")
	public String addCar(@ModelAttribute("car") Car car) {
		return "add.jsp";
	}
	
		//use JSTL forms, map easier
	@PostMapping("/add")
	public String addC(@Valid @ModelAttribute("car") Car car, BindingResult result) {
		if(result.hasErrors()) {
			return "add.jsp";
		}
		this.cService.createCar(car);
		return "redirect:/";
	}
	
	
	@PostMapping("/addOldWay")
	public String addCarToDB(@RequestParam("make") String make, @RequestParam("model") String model, @RequestParam("color") String color, @RequestParam("year") int year, @RequestParam("transmission") String transmission, RedirectAttributes redirectAttr) {
		ArrayList<String> errors = new ArrayList<String>();
		if(make.equals("")) {
			errors.add("Hey there, you for got to add a make!");
		}
//		else if(model.equals("")) {
//			errors.add("What is the model??");
//		}
//		else if(color.equals("")) {
//			errors.add("What is the color??");
//		}
//		else if(year < 0) {
//			errors.add("What is the year??");
//		}
//		else if(transmission.equals("")) {
//			errors.add("What is the transmission??");
//		}
		if(errors.size() >0) {
			for(String e: errors) {
				redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/add";
		}
		
		
		
		this.cService.createCarOldWay(make, model, color, year, transmission);
		return "redirect:/";
	}
}
