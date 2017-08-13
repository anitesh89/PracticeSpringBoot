package com.cubem.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Anitesh
 *
 */

@Entity
@Table(name="tblcategory")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "intCategoryId")
	private int categoryId;
	
	@Column(name = "strCategoryName")
	private String strCategoryName;
		
	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	//@Fetch(FetchMode.JOIN)
	@JsonIgnore
	private Set<Product> products;
	
	public Category() {
		
	}
	
	public Category(int categoryId, String strCategoryName, Set<Product> products) {
		
		this.categoryId = categoryId;
		this.strCategoryName = strCategoryName;
		this.products = products;
	}
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public int getIntCategoryId() {
		return categoryId;
	}
	public void setIntCategoryId(int intCategoryId) {
		this.categoryId = intCategoryId;
	}
	public String getStrCategoryName() {
		return strCategoryName;
	}
	public void setStrCategoryName(String strCategoryName) {
		this.strCategoryName = strCategoryName;
	}
	

}
