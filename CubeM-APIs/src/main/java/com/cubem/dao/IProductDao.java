package com.cubem.dao;

import java.util.List;

import com.cubem.entity.Category;
import com.cubem.entity.Order;
import com.cubem.entity.OrderDetails;
import com.cubem.entity.Product;
import com.cubem.entity.Test;

public interface IProductDao {
	
	List<Product> getAllProducts(); 
	List<Category> getAllCategories();
	List<Test> getAllValues();
	
	void buyProduct(OrderDetails orderDetails);
	List<Order> getAllOrders();

}
