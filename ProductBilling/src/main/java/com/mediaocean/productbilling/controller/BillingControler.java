package com.mediaocean.productbilling.controller;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mediaocean.productbilling.Vo.BillDetailsVo;
import com.mediaocean.productbilling.service.BillingDetailsService;

@RestController
public class BillingControler {
	Logger log=org.apache.logging.log4j.LogManager.getLogger(BillingControler.class);
	
	@Autowired
	BillingDetailsService billService;
	
	@GetMapping("/getDetails/{trnsId}")
	public ResponseEntity<BillDetailsVo> getDetails(@PathVariable("trnsId") long trnsId) {
		log.info("INSIDE CONTROLLER " + trnsId);
		
		return new ResponseEntity<BillDetailsVo>(billService.getBillDetailsService(trnsId),HttpStatus.OK);
		//return ;
		
	}

}
