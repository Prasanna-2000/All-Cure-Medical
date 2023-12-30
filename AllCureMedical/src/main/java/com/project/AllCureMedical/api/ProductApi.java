package com.project.AllCureMedical.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.AllCureMedical.bean.ProductsDTO;


@FeignClient(name="PRODUCT-SERVICE")
public interface ProductApi {
	@GetMapping("products/all-products")
	public List<ProductsDTO> showAllProduct();
	
	@GetMapping("products/findProduct/{id}")
	public ProductsDTO showAProduct(@PathVariable String id);
	
	@PostMapping("products/save-product")
	public String saveAProducts(@RequestBody ProductsDTO productDTO);
	
	@DeleteMapping("products/delete-product/{id}")
	public String deleteProduct(@PathVariable String id);
	
	@PutMapping("products/edit-product")
	public String editAProduct(@RequestBody ProductsDTO productDTO);
}
