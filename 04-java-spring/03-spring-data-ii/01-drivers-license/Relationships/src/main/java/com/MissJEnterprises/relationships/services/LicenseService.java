package com.MissJEnterprises.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MissJEnterprises.relationships.models.License;
import com.MissJEnterprises.relationships.models.Person;
import com.MissJEnterprises.relationships.repositories.LicenseRepository;
import com.MissJEnterprises.relationships.repositories.PersonRepository;

@Service
public class LicenseService {
	
	private final PersonRepository personRepo;
	private final LicenseRepository licenseRepo;
	
	public LicenseService(PersonRepository pRepo, LicenseRepository lRepo) {
		this.personRepo = pRepo;
		this.licenseRepo = lRepo;
	}
	
	public Person getPerson(Long id) {
		return personRepo.findById(id).orElse(null);
	}
	
	public List<Person> getPeople(){
		return personRepo.findAll();
	}
	
	public List<Person> getUnlicensedPeople(){
		return personRepo.findByLicenseIdIsNull();
	}
	
	public Person createPerson(Person p) {
		return personRepo.save(p);
	}
	
	public License createLicense(License lic) {
		lic.setNumber(this.generateLicenseNumber());
		return licenseRepo.save(lic);
	}
	
	public Integer generateLicenseNumber() {
		License lic = licenseRepo.findTopByOrderByNumberDesc();
		if(lic == null) {
			return 1;
		}
		Integer largestNumber = lic.getNumber();
		largestNumber++;
		return(largestNumber);
	}
}
