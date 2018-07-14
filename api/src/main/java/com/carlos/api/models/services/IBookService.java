package com.carlos.api.models.services;

import java.util.List;

import com.carlos.api.models.entity.Book;

public interface IBookService {
	
	public List<Book> findAll();
	
	public Book findById(Long id);
	
	public Book save(Book book);
	
	public void delete(Long id);

}
