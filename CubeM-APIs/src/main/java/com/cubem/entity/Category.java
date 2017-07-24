package com.cubem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tblcategory")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "intCategoryId")
	private int intCategoryId;
	
	@Column(name = "strCategoryName")
	private String strCategoryName;
		
	@OneToMany(mappedBy = "category")
	private List<Product> products = new ArrayList<>();
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public int getIntCategoryId() {
		return intCategoryId;
	}
	public void setIntCategoryId(int intCategoryId) {
		this.intCategoryId = intCategoryId;
	}
	public String getStrCategoryName() {
		return strCategoryName;
	}
	public void setStrCategoryName(String strCategoryName) {
		this.strCategoryName = strCategoryName;
	}
	

}
