package com.mansi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mansi.model.LoanInfo;


public interface IRCService {
	
	public LoanInfo calculateInterestRate(LoanInfo loanInfo);

}
