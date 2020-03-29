package com.gcu.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {

	@Autowired
	String orderNO;
	@Autowired
	String productName;
	@Autowired
	Float price;
	
	public String getorderNO() {
		return orderNO;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setorderNO(String orderNO) {
		this.orderNO = orderNO;
	}

	
	
	public String getproductName() {
		return productName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setproductName(String productName) {
		this.productName = productName;
	}
	
	public Float getprice() {
		return price;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}

}
