package com.mediaocean.productbilling.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.TransactionalException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaocean.productbilling.Vo.BillDetailsVo;
import com.mediaocean.productbilling.dao.BillingDetailsDaoImpl;
import com.mediaocean.productbilling.entities.Products;
import com.mediaocean.productbilling.exception.TransactionNotFound;

@Service
public class BillingDetailsService {
	
	@Autowired
	BillingDetailsDaoImpl billing;
	public BillDetailsVo getBillDetailsService(Long transId) {
		
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
			//select pd.productname,pd.productcategory,pd.price,p.quantity,
			//p.taxrate from purchases p join products pd on p.productid=pd.id
			p1.setProductname(x[0].toString());
			p1.setProductcategory(x[1].toString());
			//p1.setPrice(((BigInteger)x[2]).intValue());
			p1.setQuantity((Integer)x[3]);
			p1.setId(id++);
			//long tempPrice=(Long)();
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
