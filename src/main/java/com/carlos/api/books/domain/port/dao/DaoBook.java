package com.carlos.api.books.domain.port.dao;

import com.carlos.api.books.infrastructure.persistence.entities.EntityBook;
import com.carlos.api.books.shared.dto.DtoBook;

import java.util.List;

public interface DaoBook {

    List<DtoBook> getBookList();

    EntityBook createBook(DtoBook book);

}
