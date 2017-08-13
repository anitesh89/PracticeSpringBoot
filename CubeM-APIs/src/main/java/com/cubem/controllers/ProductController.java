package com.cubem.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<String> saveCategory(@RequestBody Category category){
		try {
			productService.saveCatgeory(category);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>("category saved", HttpStatus.OK);
	}
	
	@PostMapping("remove/category/{categoryId}")
	public ResponseEntity<String> removeCategory(@PathVariable int categoryId){
		try {
			productService.removeCatgeory(categoryId);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>("category removed", HttpStatus.OK);
	}
	
	
	@PostMapping("remove/category/{productId}")
	public ResponseEntity<String> removeProduct(@PathVariable int productId){
		try {
			productService.removeProduct(productId);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>("product removed", HttpStatus.OK);
	}



}
