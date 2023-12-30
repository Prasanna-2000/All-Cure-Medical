package com.gl.Product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.Product.bean.Products;

public interface ProductsRepository extends JpaRepository<Products, String> {
	@Query(value = "SELECT MAX(CAST(SUBSTRING(product_id, 2, length(product_id)-1) AS UNSIGNED)) FROM products", nativeQuery = true)
	public Integer findMaxProductId();
}
