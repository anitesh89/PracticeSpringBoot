/**
 * 
 */
package com.cubem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Anitesh
 *
 */

@Entity
@Table(name = "tblorderdetails")
public class OrderDetails implements Serializable {

	private static final long serialVersionUID = 18515765765727127L;
	
	 	private String id;
	    private Order order;
	 
	    private Product product;
	    private int quanity;
	    private double amount;
	    
	    public OrderDetails() {
	    	
	    }
	    
		public OrderDetails(String id, Order order, Product product, int quanity, double amount) {
			this.id = id;
			this.order = order;
			this.product = product;
			this.quanity = quanity;
			this.amount = amount;
		}

		@Id
		@Column(name = "strOrderDetailsId")
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		@ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "strOrderId", nullable = false)
		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

		@ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "strProductId", nullable = false)
		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		@Column(name = "intQuantity")
		public int getQuanity() {
			return quanity;
		}

		public void setQuanity(int quanity) {
			this.quanity = quanity;
		}

		@Column(name = "dAmt")
		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}
	    
		
		
	    

}
