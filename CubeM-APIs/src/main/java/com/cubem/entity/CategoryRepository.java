package com.cubem.entity;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface CategoryRepository extends Repository<Category, Integer>{
	
	@Query("SELECT cat FROM Category cat")
    @Transactional(readOnly = true)
	List<Category> getAllCategories();

}
