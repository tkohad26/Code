package com.mediaocean.productbilling.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.TransactionalException;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaocean.productbilling.Vo.BillDetailsVo;
import com.mediaocean.productbilling.controller.BillingControler;
import com.mediaocean.productbilling.dao.BillingDetailsDaoImpl;
import com.mediaocean.productbilling.entities.Products;
import com.mediaocean.productbilling.exception.TransactionNotFound;

@Service
public class BillingDetailsService {
	Logger log=org.apache.logging.log4j.LogManager.getLogger(BillingDetailsService.class);
	@Autowired
	BillingDetailsDaoImpl billing;
	public BillDetailsVo getBillDetailsService(Long transId) {
		log.info("INSIDE BillingDetailsService");
		List<Object[]> result = billing.getBillDetails(transId);
		if(result.size() <=0) {
			throw new TransactionNotFound();
		}
		
		BillDetailsVo vo =new BillDetailsVo();
	
		List<Products> list=new ArrayList<Products>();
		float total=0;
		float totalTax=0;
		long id=1L;
		for(Object[] x: result) {
			Products p1=new Products();
			p1.setProductname(x[0].toString());
			p1.setProductcategory(x[1].toString());
			p1.setQuantity((Integer)x[3]);
			p1.setId(id++);
			float tempPrice=((Double)x[2]).floatValue();
			tempPrice=tempPrice * ((Integer)x[3]).floatValue();
			float tax=(((Integer)x[4]).floatValue()/100);
			tax=tempPrice * tax;
			totalTax=totalTax+tax;
			float price= tempPrice+tax;
			total= (total +   price);
			p1.setPrice(price);
			list.add(p1);
		}
		vo.setProducts(list);
		vo.setTotalAmount(total);
		vo.setTotaltax(totalTax);
		vo.setUserName("user1");
		
		return vo;
	}

}
