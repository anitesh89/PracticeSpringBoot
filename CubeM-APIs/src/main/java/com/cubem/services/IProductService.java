package com.cubem.services;

import java.util.List;

import com.cubem.entity.Category;
import com.cubem.entity.Order;
import com.cubem.entity.OrderDetails;
import com.cubem.entity.Product;
import com.cubem.entity.Test;

public interface IProductService {

	List<Product> getAllProducts(); 
	List<Category> getAllCategories();
	List<Test> getAllValues();
	
	Product findProductById(int productId);
	
	void saveProduct(Product product);
	void saveCatgeory(Category category);
	
	void buyProduct(OrderDetails orderDetails);
	
	List<Order> getAllOrders();
	void removeCatgeory(int categoryId);
	void removeProduct(int productId);
}
