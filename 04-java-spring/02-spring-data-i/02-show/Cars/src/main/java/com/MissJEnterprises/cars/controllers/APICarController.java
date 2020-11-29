package com.MissJEnterprises.cars.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MissJEnterprises.cars.models.Car;
import com.MissJEnterprises.cars.services.CarService;

@RestController
@RequestMapping("/api")   //prefixes all other requestmappings to show up AFTER this one, so nothing goes to the root
public class APICarController {
	private CarService cService;
	
	public APICarController(CarService service) {
		this.cService = service;
	}
	
		//Routes
	@RequestMapping("")
	public List<Car> index(){
		return this.cService.getAllCars();
	}
	
	@RequestMapping("/{id}")
	public Car getCar(@PathVariable("id") Long id) {
		return this.cService.getSingleCar(id);
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public Car create(Car car) {
		return this.cService.createCar(car);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteCar(@PathVariable("id") Long id) {
		this.cService.deleteCar(id);
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void updateCar(@PathVariable("id") Long id, Car updatedCar) {
		this.cService.updateCar(updatedCar);
		
	}
}
