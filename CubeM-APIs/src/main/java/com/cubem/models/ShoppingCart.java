package com.cubem.models;

public class ShoppingCart {
	
	private ProductInfo productInfo;
	private int quantity;
	public ProductInfo getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTotalAmount() {
        return this.productInfo.getPrice() * this.quantity;
    }
    
	

}
