package com.MissJEnterprises.languagescopy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MissJEnterprises.languagescopy.models.LanguagesModel;
import com.MissJEnterprises.languagescopy.repositories.LanguagesRepository;


@Service
public class LanguagesService {
	private final LanguagesRepository langRepo;
	public LanguagesService(LanguagesRepository repo) {
		langRepo = repo;
	}
	
	public List<Language> allLanguages(){
		return langRepo.findall();
	}
	
	public List<Language> allLanguages() {
		return langRepo.findAll();
	}
	
	public Language findLanguage(Long id) {
		return langRepo.findById(id).orElse(null);
	}
	public Language createLanguage(Language lang) {
		return langRepo.save(lang);
	}
	
	public Language updateLanguage(Language lang) {
		return langRepo.save(lang);
	}
	
	public void deleteLanguage(Long id) {
		langRepo.deleteById(id);
	}
}