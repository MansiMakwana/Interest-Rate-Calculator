package com.mansi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mansi.model.LoanInfo;
import com.mansi.service.IRCService;
import com.mansi.service.IRCServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class IRCController {
	
	@Autowired
	private IRCServiceImpl service;
	
	@PostMapping("/")
	public LoanInfo calculateInterestRate(@RequestBody LoanInfo loanInfo)
	{
		return service.calculateInterestRate(loanInfo);
	}
	
	
	
	
	

}
