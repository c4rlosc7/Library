package com.carlos.api.books.domain.services;

import com.carlos.api.books.domain.port.dao.DaoBook;
import com.carlos.api.books.infrastructure.persistence.entities.EntityBook;
import com.carlos.api.books.shared.dto.DtoBook;
import org.springframework.stereotype.Service;

@Service
public class ServiceCreateBook {
    private static final String EL_LIBRO_YA_EXISTE_EN_EL_SISTEMA = "El libro ya existe en el sistema";

    private DaoBook daoBook;

    public ServiceCreateBook(DaoBook daoBook) {
        this.daoBook = daoBook;
    }

    public EntityBook run(DtoBook book) {
        return this.daoBook.createBook(book);
    }
}
