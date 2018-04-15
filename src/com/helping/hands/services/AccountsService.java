package com.helping.hands.services;

import com.helping.hands.domain.Book;

public interface AccountsService 
{
	public void raiseInvoice(Book requiredBook) throws CustomerCreditExcededException;
}
