package com.mediaocean.productbilling.Vo;

import java.util.List;

import com.mediaocean.productbilling.entities.Products;

public class BillDetailsVo {
	
	private String userName;
	private float totalAmount;
	private float totaltax;
	List<Products> products;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public float getTotaltax() {
		return totaltax;
	}
	public void setTotaltax(float totaltax) {
		this.totaltax = totaltax;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	

}
