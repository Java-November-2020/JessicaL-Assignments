package com.MissJEnterprises.ProductsAndCategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MissJEnterprises.ProductsAndCategories.models.Association;
import com.MissJEnterprises.ProductsAndCategories.models.Category;
import com.MissJEnterprises.ProductsAndCategories.models.Product;
import com.MissJEnterprises.ProductsAndCategories.repositories.AssociationRepository;
import com.MissJEnterprises.ProductsAndCategories.repositories.CategoryRepository;
import com.MissJEnterprises.ProductsAndCategories.repositories.ProductRepository;

@Service
public class MainService {

	private final ProductRepository pRepo;
	private final CategoryRepository cRepo;
	private final AssociationRepository aRepo;
	public MainService(ProductRepository pRepo, CategoryRepository cRepo, AssociationRepository aRepo) {
		this.pRepo = pRepo;
		this.cRepo = cRepo;
		this.aRepo = aRepo;
	}
	public List<Product> findProducts() {
		return this.pRepo.findAll();
	}
	public Product getProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	public List<Category> findCategories() {
		return this.cRepo.findAll();
	}
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	public Association createAssociation(Association ass) {
		return this.aRepo.save(ass);
	}
	public List<Category> findCategoriesNotInProduct(Product product) {
		return cRepo.findByProductsNotContains(product);
	}
	public List<Product> findProductsNotInCategory(Category category) {
		return pRepo.findByCategoriesNotContains(category);
	}
}
