package com.helping.hands.services;

import java.util.List;

import com.helping.hands.data.BookNotFoundException;
import com.helping.hands.domain.Book;

public interface BookService 
{
	   public List<Book> getAllBooksByAuthor(String author);
	   public List<Book> getAllRecommendedBooks(String userId);
	   public Book getBookByIsbn(String isbn) throws BookNotFoundException;
	   public List<Book> getEntireCatalogue();
	   public void registerNewBook(Book newBook);
	   public void deleteFromStock(Book oldBook);
}
