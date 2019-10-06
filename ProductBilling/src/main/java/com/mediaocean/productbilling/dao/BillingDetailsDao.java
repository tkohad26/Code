package com.mediaocean.productbilling.dao;

import java.util.List;

public interface BillingDetailsDao {
	
	public List<Object[]> getBillDetails(Long transId);

}
