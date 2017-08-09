package com.cubem.models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartInfo {

	private int orderNum;
	 
    private CustomerInfo customerInfo;
 
    private final List<ShoppingCart> shoppingCart = new ArrayList<ShoppingCart>();
 
    public ShoppingCartInfo() {
 
    }

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	public List<ShoppingCart> getCartLines() {
		return shoppingCart;
	}
	
	private ShoppingCart findItemsInCart(int productId) {
        for (ShoppingCart cart : this.shoppingCart) {
            if (cart.getProductInfo().getId() == productId) {
                return cart;
            }
        }
        return null;
    }
    
    
}
