package com.carlos.api.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.carlos.api.models.entity.Book;

public interface IBookDao extends CrudRepository<Book, Long>{

}
