//http://localhost:6161/swagger-ui.html

package com.gl.Product.controller;
import com.gl.Product.bean.*;
import com.gl.Product.service.ProductsService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/products")
public class ProductRestController {
	@Autowired
	public  ProductsService productsService;
	
	@GetMapping(value="all-products", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsDTO> showAllProduct() {
		List<ProductsDTO> productList = productsService.findAllProduct();
		return productList;
	}
	@GetMapping(value="findProduct/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductsDTO showAProduct(@PathVariable String id) {
		ProductsDTO product = productsService.findProductById(id);
		return product;
	}
	
	@DeleteMapping(value="delete-product/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public String deleteProduct(@PathVariable String id) {
		productsService.DeleteAProduct(id);
		return "Product Deleted";
	}
	
	@PutMapping(value="/edit-product", consumes={MediaType.APPLICATION_JSON_VALUE})
	public String editAProduct(@RequestBody ProductsDTO productDTO) {
		ProductsDTO products = productsService.findProductById(productDTO.getProductId());
		//products.setProductName(productDTO.getProductId());
		products.setRetailRate(productDTO.getRetailRate());
		products.setWholesaleRate(productDTO.getWholesaleRate());
		products.setStock(productDTO.getStock());
		productsService.SaveProduct(products);
		return "Product update successfull";
	}
	
	@PostMapping(value = "/save-product", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveAProducts(@RequestBody ProductsDTO productDTO) {
		productDTO.setProductId(productsService.generateId()); //generate id
		productsService.SaveProduct(productDTO);
		return "New Product saved";
	}


}
