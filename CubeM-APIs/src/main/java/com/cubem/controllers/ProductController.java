package com.cubem.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cubem.entity.Category;
import com.cubem.entity.Product;
import com.cubem.entity.Test;
import com.cubem.services.IProductService;

@Controller
@RequestMapping("cubem")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	/*@Autowired
	ProductRepository productRepository;
	*/
	@GetMapping("products")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> allProducts = productService.getAllProducts();
		return new ResponseEntity<List<Product>>(allProducts, HttpStatus.OK);
	}
	@GetMapping("category")
	public ResponseEntity<List<Category>> getAllCategory(){
		List<Category> allCategories = productService.getAllCategories();
		return new ResponseEntity<List<Category>>(allCategories, HttpStatus.OK);
	}
	@GetMapping("test")
	public ResponseEntity<List<Test>> getAllValues(){
		List<Test> allValues = productService.getAllValues();
		return new ResponseEntity<List<Test>>(allValues, HttpStatus.OK);
	}
	
	@PostMapping("save/products")
	public void saveProducts(@RequestBody Product product){
		productService.saveProduct(product);
	}
	
	@PostMapping("save/category")
	public void saveCategory(@RequestBody Category category){
		productService.saveCatgeory(category);
	}



}
