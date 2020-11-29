package com.MissJEnterprises.cars.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MissJEnterprises.cars.models.Car;
import com.MissJEnterprises.cars.repositories.CarRepository;

@Service

public class CarService {
		//Dependency Injection
	private CarRepository cRepo;
	
		//Constructor
	public CarService(CarRepository repo) {
			this.cRepo = repo;
	}
	
	
		//Get all cars
	public List<Car> getAllCars(){
		return this.cRepo.findAll();
	}
	
		//Get one car
	public Car getSingleCar(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
		//Create car
	public Car createCar(Car newCar) {
		return this.cRepo.save(newCar);
	}
	
		// Delete car
	public void deleteCar(Long id) {
		this.cRepo.deleteById(id);
	}
	
		//Update car
	public void updateCar(Car car) {
		this.cRepo.save(car);
	}
	
		//create object with parameters
	public Car createCarOldWay(String make, String model, String color, int year, String transmission) {
		Car newCar = new Car(make, model, color, year, transmission);
		return this.cRepo.save(newCar);
	}
}
