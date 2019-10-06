package com.mediaocean.productbilling.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mediaocean.productbilling.entities.Purchases;

public interface TransactionRepository extends CrudRepository<Purchases, Long> {
	
	@Query(value="select pd.productname,pd.productcategory,pd.price,p.quantity,p.taxrate from purchases p join products pd on p.productid=pd.id where p.transid=:transId",nativeQuery=true)
	public List<Object[]> getTransactionDetails(@Param("transId") long transId);	

}
