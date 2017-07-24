package com.cubem.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubem.dao.IProductDao;
import com.cubem.entity.Category;
import com.cubem.entity.Product;
import com.cubem.entity.Test;
import com.cubem.services.IProductService;

@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private IProductDao productDao;

	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	@Override
	public List<Category> getAllCategories() {
		return productDao.getAllCategories();
	}

	@Override
	public List<Test> getAllValues() {
		// TODO Auto-generated method stub
		return productDao.getAllValues();
	}

}
