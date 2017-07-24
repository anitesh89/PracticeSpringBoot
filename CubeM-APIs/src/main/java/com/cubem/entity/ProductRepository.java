package com.cubem.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
