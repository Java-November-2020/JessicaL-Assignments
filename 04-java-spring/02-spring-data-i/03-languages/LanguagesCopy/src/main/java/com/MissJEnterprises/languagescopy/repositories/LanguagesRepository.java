package com.MissJEnterprises.languagescopy.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MissJEnterprises.languagescopy.models.LanguagesModel;

@Repository
public interface LanguagesRepository extends CrudRepository<Language, Long>{
	List<Language> findall();
}