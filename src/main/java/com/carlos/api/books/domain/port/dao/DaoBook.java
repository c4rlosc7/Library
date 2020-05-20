package com.carlos.api.books.domain.port.dao;

import com.carlos.api.books.domain.model.dto.DtoBook;
import com.carlos.api.books.domain.model.entities.EntityBook;

import java.util.List;

public interface DaoBook {

    List<DtoBook> getBookList();

    void createBook(EntityBook book);

}
