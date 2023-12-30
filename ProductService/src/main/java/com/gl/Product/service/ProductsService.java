package com.gl.Product.service;

import java.util.List;

import com.gl.Product.bean.ProductsDTO;

public interface ProductsService {
	public void SaveProduct(ProductsDTO productDTO);
	public List<ProductsDTO> findAllProduct();
	public ProductsDTO findProductById(String Id);
	public void DeleteAProduct(String Id);
	public String generateId();
}
