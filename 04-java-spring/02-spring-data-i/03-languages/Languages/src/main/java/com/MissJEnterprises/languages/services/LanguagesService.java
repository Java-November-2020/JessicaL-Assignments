package com.MissJEnterprises.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MissJEnterprises.languages.models.Language;
import com.MissJEnterprises.languages.repositories.LanguagesRepository;

@Service
public class LanguagesService {

		//Dependency injection from the repository
	private LanguagesRepository lRepo;
	
		//constructor
	public LanguagesService(LanguagesRepository repo) {
		this.lRepo = repo;
	}
	
		//CRUD methods
		//CREATE - create a new record
	public Language createLang(Language newLang) {
		return this.lRepo.save(newLang);
	}
	
		//Create object with parameters
	public Language createLangOldWay(String name, String creator, Double version) {
		Language newLang = new Language(name, creator, version);
		return this.lRepo.save(newLang);
	}
	
		//READ - get all records
	public List<Language> getAllLanguages(){
		return this.lRepo.findAll();
	}
	
		//READ - get one record
	public Language getSingleLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
		//UPDATE - update an existing record
	public Language updateLang(Language lang) {
		return this.lRepo.save(lang);
	}
	
		//DELETE - delete an existing record
	public void deleteLang(Long id) {
		this.lRepo.deleteById(id);
	}
	
	
	
	
}
