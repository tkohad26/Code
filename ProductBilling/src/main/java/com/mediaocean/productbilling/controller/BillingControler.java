package com.mediaocean.productbilling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediaocean.productbilling.Vo.BillDetailsVo;
import com.mediaocean.productbilling.repositories.TransactionRepository;
import com.mediaocean.productbilling.service.BillingDetailsService;

@RestController
public class BillingControler {
	
	@Autowired
	BillingDetailsService billService;
	
	@GetMapping("/getDetails/{trnsId}")
	public BillDetailsVo getDetails(@PathVariable("trnsId") long trnsId) {
		
		System.out.println("Trans Id ********************** "+trnsId);
		return billService.getBillDetailsService(trnsId);
		
	}

}
