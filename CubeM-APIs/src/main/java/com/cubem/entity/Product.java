package com.cubem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="tblproducts")
public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int intProductId;
	
	
	private String productName;
	
	
	private String productSize;
	
	
	private String productColor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "intCategoryId", nullable = false)
	private Category category;
	
	/*@Column(name = "blobImage")
	private Byte productImage;
	*/
	
	public Product(int intProductId, String productName, String productSize, String productColor, Category category,
			double productPrice) {
		super();
		this.intProductId = intProductId;
		this.productName = productName;
		this.productSize = productSize;
		this.productColor = productColor;
		this.category = category;
		this.productPrice = productPrice;
	}
	
	
	public Category getCategory() {
		return category;
	}

	

	public void setCategory(Category category) {
		this.category = category;
	}
	private double productPrice;

	
	public Product(int intProductId, String productName, String productSize, String productColor, 
			double productPrice) {
		
		this.intProductId = intProductId;
		this.productName = productName;
		this.productSize = productSize;
		this.productColor = productColor;
		this.productPrice = productPrice;
		
	}
	
	@Column(name="intProductId")
	public int getProductId() {
		return intProductId;
	}
	public void setProductId(int intProductId) {
		this.intProductId = intProductId;
	}
	
	@Column(name="strProductName")
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Column(name="strSize")
	public String getProductSize() {
		return productSize;
	}
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}
	
	@Column(name="strColor")
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	
	@Column(name="dPrice")
	public double getProductPrice() {
		return productPrice;
	}
	
	/*@Column(name="intCatgeoryId")
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*public Byte getProductImage() {
		return productImage;
	}*/
	/*public void setProductImage(Blob productImage) {
		this.productImage = productImage;
	}*/
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	

}
