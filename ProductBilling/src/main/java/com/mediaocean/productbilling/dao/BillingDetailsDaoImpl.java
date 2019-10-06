package com.mediaocean.productbilling.dao;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mediaocean.productbilling.repositories.TransactionRepository;

@Repository
public class BillingDetailsDaoImpl implements BillingDetailsDao {
	Logger log=org.apache.logging.log4j.LogManager.getLogger(BillingDetailsDaoImpl.class);
	@Autowired
	TransactionRepository repoTrans;

	@Override
	public List<Object[]> getBillDetails(Long transId) {
	log.info("INSIDE BillingDetailsDaoImpl");

	List<Object[]> result = repoTrans.getTransactionDetails(transId);
	log.info("EXIT BillingDetailsDaoImpl WITH RESULT "+result.size() );	
		//System.out.println("--->> "+result.toString());
		
		
		return result;
	}

}
