package com.carlos.api.books.infrastructure.persistence.adapter.dao;

import java.util.List;

import com.carlos.api.books.domain.model.dto.DtoBook;
import com.carlos.api.books.domain.model.entities.EntityBook;
import com.carlos.api.books.domain.port.dao.DaoBook;
import com.carlos.api.books.infrastructure.persistence.jpa.JPABook;
import com.carlos.api.books.infrastructure.persistence.mapper.MapperBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoBookInMemory implements DaoBook {

    @Autowired
    private JPABook bookJPA;

    @Override
    public List<DtoBook> getBookList() {
        return MapperBook.transformListEntityToDto(bookJPA.findAll());
    }

    @Override
    public void createBook(EntityBook book) {

    }
}
