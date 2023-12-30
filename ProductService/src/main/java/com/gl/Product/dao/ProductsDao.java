package com.gl.Product.dao;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.gl.Product.bean.Products;
import com.gl.Product.bean.ProductsDTO;


@RestController
public interface ProductsDao {
	public void SaveProduct(Products product);
	public List<Products> findAllProduct();
	public Products findProductById(String Id);
	public void DeleteAProduct(String Id);
	public String generateId();

}
