package com.MissJEnterprises.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MissJEnterprises.languages.models.Language;

@Repository
public interface LanguagesRepository extends CrudRepository<Language, Long>{
		//select * from languages
	List<Language> findAll();
	
}
