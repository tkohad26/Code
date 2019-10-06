package com.mediaocean.productbilling.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Purchases {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int transid ;
	private int productid ;
	private int quantity ;
	private int taxrate;
	public Purchases() {
		
	}
	public Purchases(int transid, int productid, int quantity, int taxrate) {
		super();
		this.transid = transid;
		this.productid = productid;
		this.quantity = quantity;
		this.taxrate = taxrate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getTransid() {
		return transid;
	}
	public void setTransid(int transid) {
		this.transid = transid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTaxrate() {
		return taxrate;
	}
	public void setTaxrate(int taxrate) {
		this.taxrate = taxrate;
	}
	
	

}
