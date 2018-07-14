package com.carlos.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.api.models.entity.Book;
import com.carlos.api.models.services.IBookService;

@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("/api")
public class BookRestController {

	@Autowired
	private IBookService bookService;
	
	@GetMapping("/books")
	public List<Book> index(){
		return bookService.findAll();
	}
	
	@GetMapping("/books/{id}")
	public Book show(@PathVariable Long id) {
		return bookService.findById(id);
	}
	
	@PostMapping("/books")
	@ResponseStatus(HttpStatus.CREATED)
	public Book create(@RequestBody Book book) {
		return bookService.save(book);
	}
	
	@PutMapping("/books/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Book update(@RequestBody Book book, @PathVariable Long id) {
		Book bookUpdate = bookService.findById(id);
		
		bookUpdate.setIsbn(book.getIsbn());
		bookUpdate.setTitle(book.getTitle());
		bookUpdate.setSubtitle(book.getSubtitle());
		bookUpdate.setAuthor(book.getAuthor());
		bookUpdate.setPublished(book.getPublished());
		bookUpdate.setPages(book.getPages());
		bookUpdate.setDescription(book.getDescription());
		bookUpdate.setWebsite(book.getWebsite());
		bookUpdate.setState(book.getState());
		
		return bookService.save(book);
	}
	
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		bookService.delete(id);
	}
	
	
}
