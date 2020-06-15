package com.carlos.api.books.infrastructure.persistence.adapter.dao;

import java.util.List;

import com.carlos.api.books.domain.port.dao.DaoBook;
import com.carlos.api.books.infrastructure.persistence.entities.EntityBook;
import com.carlos.api.books.infrastructure.persistence.jpa.JPABook;
import com.carlos.api.books.infrastructure.persistence.mapper.MapperBookEntityToDtoBook;

import com.carlos.api.books.infrastructure.persistence.mapper.MapperDtoBookToBookEntity;
import com.carlos.api.books.shared.dto.DtoBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoBookInMemory implements DaoBook {

    @Autowired
    private JPABook bookJPA;

    @Override
    public List<DtoBook> getBookList() {
        return MapperBookEntityToDtoBook.mapperListEntityBookToDtoBook(bookJPA.findAll());
    }

    @Override
    public EntityBook createBook(DtoBook book) {
        return bookJPA.save(MapperDtoBookToBookEntity.mapperDtoBookToEntityBook(book));
    }
}
