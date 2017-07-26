package com.cubem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.sql.Blob;

/**
 * @author Anitesh
 *
 */

@Entity
@Table(name = "tblproducts")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "intProductId")
	private int productId;

	private String productName;

	private String productSize;

	private String productColor;
	
	private Blob productImage;
	
	private double productPrice;

	@ManyToOne
	@JoinColumn(name = "intCategoryId")
	@JsonIgnore
	private Category category;

	public Product() {

	}

	public Product(int intProductId, String productName, String productSize, String productColor,Blob productImage, Category category,
			double productPrice) {

		this.productId = intProductId;
		this.productName = productName;
		this.productSize = productSize;
		this.productColor = productColor;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.category = category;
		
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int intProductId) {
		this.productId = intProductId;
	}

	@Column(name = "strProductName")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "strSize")
	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	@Column(name = "strColor")
	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	
	@Column(name = "productImage")
	public Blob getProductImage() {
		return productImage;
	}

	public void setProductImage(Blob productImage) {
		this.productImage = productImage;
	}

	@Column(name = "dPrice")
	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	
	
	

}
