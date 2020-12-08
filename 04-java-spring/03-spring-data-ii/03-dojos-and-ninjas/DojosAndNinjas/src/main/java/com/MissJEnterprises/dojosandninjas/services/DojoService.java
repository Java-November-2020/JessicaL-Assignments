package com.MissJEnterprises.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MissJEnterprises.dojosandninjas.models.Dojo;
import com.MissJEnterprises.dojosandninjas.models.Ninja;
import com.MissJEnterprises.dojosandninjas.repositories.DojoRepository;
import com.MissJEnterprises.dojosandninjas.repositories.NinjaRepository;

@Service
public class DojoService {

		@Autowired
		private DojoRepository dRepo;
		private NinjaRepository nRepo;
		
		public DojoService(DojoRepository dRepo, NinjaRepository nRepo) {
			this.dRepo = dRepo;
			this.nRepo = nRepo;
		}
		
			//dojo models
		public Dojo createDojo(Dojo dojo) {
			return dRepo.save(dojo);
		}
		
		public List<Dojo> allDojos(){
			return dRepo.findAll();
		}
		
		public Dojo findDojo(Long id) {
			return this.dRepo.findById(id).orElse(null);
		}
		
		public Ninja createNinja(Ninja ninja) {
			return nRepo.save(ninja);
		}
		
		public List<Ninja> allNinjas(){
			return nRepo.findAll();
		}
		
		public Ninja findNinja(Long id) {
			return this.nRepo.findById(id).orElse(null);
		}
		
		
		
		
		
}
