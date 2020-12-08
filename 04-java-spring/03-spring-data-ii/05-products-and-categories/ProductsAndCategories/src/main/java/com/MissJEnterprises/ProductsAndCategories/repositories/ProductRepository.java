package com.MissJEnterprises.ProductsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.MissJEnterprises.ProductsAndCategories.models.Category;
import com.MissJEnterprises.ProductsAndCategories.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}
