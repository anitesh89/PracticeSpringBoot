package com.cubem.dao.impl;


import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cubem.dao.IProductDao;
import com.cubem.entity.Category;
import com.cubem.entity.CategoryRepository;
import com.cubem.entity.Product;
import com.cubem.entity.Test;

@Transactional
@Repository
public class ProductDaoImpl implements IProductDao {
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	/*private List<Product> products = Arrays.asList(new Product(1, "NylonTshirt", "XL", "Black", 2000, 1),
			new Product(2, "CottonShirt", "XL", "White", 1000, 1));*/

	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		System.out.println("inside products");
		
		List<Product> resultList = (List<Product>)entityManager.createQuery("from Product").getResultList(); 
		//entityManager.createNativeQuery("select * from tblProducts order by intProductId").getResultList();
		return resultList;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getAllCategories() {
		System.out.println("inside category");
       //List<Category> categories = //categoryRepository.getAllCategories();
    		   
    		  // entityManager.createNativeQuery("select cat.intCategoryId as categoryId,cat.strCategoryName as categoryName from tblCategory cat order by cat.intCategoryId").getResultList();
		
		
	   Query getCategories = entityManager.createQuery("from Category");
	   List<Category> categories = getCategories.getResultList();
	   return categories;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Test> getAllValues() {
       String hql = "FROM Test ORDER BY id";
		
		return (List<Test>) entityManager.createQuery(hql).getResultList();
	}

}
