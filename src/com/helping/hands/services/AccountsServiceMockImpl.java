package com.helping.hands.services;

import org.springframework.stereotype.Service;

import com.helping.hands.domain.Book;

@Service
public class AccountsServiceMockImpl implements AccountsService
{	
	public void raiseInvoice(Book requiredBook) throws CustomerCreditExcededException
	{
		System.out.println("Raised an invoice");
		//throw new CustomerCreditExcededException();
	}
}
