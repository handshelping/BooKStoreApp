package com.helping.hands.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.helping.hands.data.BookDao;
import com.helping.hands.data.BookNotFoundException;
import com.helping.hands.domain.Book;
import com.helping.hands.services.AccountsService;
import com.helping.hands.services.BookService;
import com.helping.hands.services.CustomerCreditExcededException;
import com.helping.hands.services.PurchasingService;

public class Client 
{
	public static void main(String[] args)
	{	
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");

		try
		{
			PurchasingService purchasing = container.getBean(PurchasingService.class);
			BookService bookService = (BookService)container.getBean("bookService");
			
//			bookService.registerNewBook(new Book("494949484748", "Java Programming", "Gary Cornell", 10.99));
			
			List<Book> allBooks = bookService.getAllBooksByAuthor("Gary Cornell");
			
			for (Book book: allBooks)
			{
				System.out.println(book);
			}
		}
		finally
		{		
			container.close();
		}
	}
}
