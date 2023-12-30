package com.gl.Product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gl.Product.bean.Products;



@Repository
public class ProductsDaoImpl implements ProductsDao {
@Autowired
public ProductsRepository repository;
	@Override
	public void SaveProduct(Products products) {
		repository.save(products);

	}
	@Override
	public List<Products> findAllProduct() {
		List<Products> personsList = repository.findAll();
		return personsList;
	}
	@Override
	public Products findProductById(String id) {
		return repository.findById(id).orElse(null);

	}
	@Override
	public void DeleteAProduct(String id) {
		repository.deleteById(id);
		
	}
	@Override
	public String generateId() {
		Integer val =repository.findMaxProductId();
		if(val == null)
			val = 1001;
		else
			val = val + 1;
		return "P"+val;
	}	

}
