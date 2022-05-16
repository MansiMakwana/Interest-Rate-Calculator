package com.mansi.service;

import org.springframework.stereotype.Service;

import com.mansi.model.LoanInfo;

@Service
public class IRCServiceImpl implements IRCService{

	@Override
	public LoanInfo calculateInterestRate(LoanInfo loanInfo) {
		// TODO Auto-generated method stub
		System.out.println("Inside Service layer");
		
		int creditScore =loanInfo.getCreditScore();
		
		if(loanInfo.getSalariedOrSelfEmployed())
		{
			if(creditScore <701)
				loanInfo.setInterestRate(8.10);
			else if(creditScore>701 && creditScore<726)
				loanInfo.setInterestRate(7.10);
			else if(creditScore>726 && creditScore<751)
				loanInfo.setInterestRate(7.00);
			else if(creditScore>751 && creditScore<771)
				loanInfo.setInterestRate(6.85);
			else if(creditScore>771 && creditScore<800)
				loanInfo.setInterestRate(6.75);
			else if(creditScore>800)
				loanInfo.setInterestRate(6.75);
			
			
		}
		else
		{
			if(creditScore <701)
				loanInfo.setInterestRate(8.20);
			else if(creditScore>701 && creditScore<726)
				loanInfo.setInterestRate(7.20);
			else if(creditScore>726 && creditScore<751)
				loanInfo.setInterestRate(7.10);
			else if(creditScore>751 && creditScore<771)
				loanInfo.setInterestRate(6.95);
			else if(creditScore>771 && creditScore<800)
				loanInfo.setInterestRate(6.85);
			else if(creditScore>800)
				loanInfo.setInterestRate(6.85);
			
		}
		return loanInfo;
		
	}
	
	

}
