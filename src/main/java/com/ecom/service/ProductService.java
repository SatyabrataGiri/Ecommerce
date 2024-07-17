package com.ecom.service;

import java.util.List;

import com.ecom.model.Product;
import com.ecom.service.impl.MultipartFile;

public interface ProductService {
	
	public Product saveProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public Boolean deleteProduct(Integer id);
	
	public Product getProductById(Integer id);
	
	public Product updateProduct(Product product, org.springframework.web.multipart.MultipartFile image);

	Product updateProduct(Product product, MultipartFile image);
	

}
