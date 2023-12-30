package com.gl.Product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.Product.bean.Products;
import com.gl.Product.bean.ProductsDTO;
import com.gl.Product.dao.ProductsDao;

@Service
public class ProductServiceImpl implements ProductsService {
	@Autowired
	private ProductsDao productsDao;

	@Override
	public void SaveProduct(ProductsDTO productDTO) {
		Products products = new Products(productDTO);
		productsDao.SaveProduct(products);		
	}

	@Override
	public List<ProductsDTO> findAllProduct() {
		List<ProductsDTO> productDtoList = new ArrayList<>();
		for(Products product: productsDao.findAllProduct()) {
			ProductsDTO productDto = new ProductsDTO(product);
			productDtoList.add(productDto);
		}
		return productDtoList;
	}

	@Override
	public ProductsDTO findProductById(String Id) {
		Products products = productsDao.findProductById(Id);
		ProductsDTO pDto = new ProductsDTO(products);
		return pDto;
	}

	@Override
	public void DeleteAProduct(String Id) {
		productsDao.DeleteAProduct(Id);
		
	}

	@Override
	public String generateId() {
		String val = productsDao.generateId();
		return val;
	}

	
}
