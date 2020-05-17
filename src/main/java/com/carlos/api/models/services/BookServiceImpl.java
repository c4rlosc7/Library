package com.carlos.api.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carlos.api.models.dao.IBookDao;
import com.carlos.api.models.entity.Book;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookDao bookDao;

	@Override
	@Transactional(readOnly = true)
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return (List<Book>) bookDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Book findById(Long id) {
		// TODO Auto-generated method stub
		return bookDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return bookDao.save(book);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		bookDao.deleteById(id);
	}

}
