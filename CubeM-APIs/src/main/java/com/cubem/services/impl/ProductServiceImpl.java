package com.cubem.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubem.dao.IProductDao;
import com.cubem.entity.Category;
import com.cubem.entity.CategoryRepository;
import com.cubem.entity.Order;
import com.cubem.entity.OrderDetails;
import com.cubem.entity.Product;
import com.cubem.entity.ProductRepository;
import com.cubem.entity.Test;
import com.cubem.services.IProductService;

@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private IProductDao productDao;
	@Autowired
	private CategoryRepository categoryRepo;
	
	@Autowired
	private ProductRepository productRepo;
	

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		
		productRepo.findAll().forEach(products :: add);
		//products = productDao.getAllProducts();
		
		return products;
	}

	@Override
	public List<Category> getAllCategories() {
         List<Category> categories = new ArrayList<>();
		
		//categoryRepo.findAll().forEach(categories :: add);
         categories = productDao.getAllCategories();
		
		return categories;
	}

	@Override
	public List<Test> getAllValues() {
		// TODO Auto-generated method stub
		return productDao.getAllValues();
	}

	@Override
	public void saveProduct(Product product) {
		productRepo.save(product);
		
	}

	@Override
	public void saveCatgeory(Category category) {
		categoryRepo.save(category);
		
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buyProduct(OrderDetails orderDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCatgeory(int categoryId) {
		categoryRepo.delete(categoryId);
		
	}

	@Override
	public void removeProduct(int productId) {
		productRepo.delete(productId);
		
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
