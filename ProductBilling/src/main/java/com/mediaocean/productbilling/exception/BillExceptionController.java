package com.mediaocean.productbilling.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BillExceptionController {
	
	@ExceptionHandler(TransactionNotFound.class)
	public ResponseEntity<Object> exception(TransactionNotFound ex){
		return new ResponseEntity<Object>("Invalid Transaction Id",HttpStatus.NOT_FOUND);
	}

}
