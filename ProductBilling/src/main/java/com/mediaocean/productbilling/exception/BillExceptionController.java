package com.mediaocean.productbilling.exception;

import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mediaocean.productbilling.dao.BillingDetailsDaoImpl;

@ControllerAdvice
public class BillExceptionController {
	Logger log=org.apache.logging.log4j.LogManager.getLogger(BillExceptionController.class);
	@ExceptionHandler(TransactionNotFound.class)
	public ResponseEntity<Object> exception(TransactionNotFound ex){
		log.info("INSIDE BillExceptionController");
		return new ResponseEntity<Object>("Invalid Transaction Id",HttpStatus.NOT_FOUND);
	}

}
