package com.helping.hands.services;

import com.helping.hands.data.BookNotFoundException;

public interface PurchasingService 
{
	public void buyBook(String isbn) throws BookNotFoundException, CustomerCreditExcededException;
}