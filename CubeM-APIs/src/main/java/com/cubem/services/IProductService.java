package com.cubem.services;

import java.util.List;

import com.cubem.entity.Category;
import com.cubem.entity.Product;
import com.cubem.entity.Test;

public interface IProductService {

	List<Product> getAllProducts(); 
	List<Category> getAllCategories();
	List<Test> getAllValues();
}