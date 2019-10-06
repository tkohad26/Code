package com.mediaocean.productbilling.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mediaocean.productbilling.repositories.TransactionRepository;

@Repository
public class BillingDetailsDaoImpl implements BillingDetailsDao {
	
	@Autowired
	TransactionRepository repoTrans;

	@Override
	public List<Object[]> getBillDetails(Long transId) {
		// TODO Auto-generated method stub
		List<Object[]> result = repoTrans.getTransactionDetails(transId);
		
		//System.out.println("--->> "+result.toString());
		
		
		return result;
	}

}
