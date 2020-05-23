package com.carlos.api.books.domain.services;

import com.carlos.api.books.domain.exceptions.ExceptionsBook;
import com.carlos.api.books.domain.model.dto.DtoBook;
import com.carlos.api.books.domain.port.dao.DaoBook;
import org.slf4j.ILoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ServiceBooksList {

    public static final String lIST_BOOK_IS_EMPTY = "NO SE ENCONTRARON DATOS";

    private DaoBook daoBookPort;

    public ServiceBooksList(DaoBook daoBookPort) {
        this.daoBookPort = daoBookPort;
    }

    public Collection<DtoBook> run() {
        List<DtoBook> dtoBookList = new ArrayList<>();
        dtoBookList = this.daoBookPort.getBookList();

        if (dtoBookList.isEmpty()) {
            throw new ExceptionsBook(lIST_BOOK_IS_EMPTY);
        }
        return this.daoBookPort.getBookList();
    }

}
