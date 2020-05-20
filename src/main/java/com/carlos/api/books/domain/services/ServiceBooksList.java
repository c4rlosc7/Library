package com.carlos.api.books.domain.services;

import com.carlos.api.books.domain.model.dto.DtoBook;
import com.carlos.api.books.domain.port.dao.DaoBook;

import java.util.Collection;

public class ServiceBooksList {

    private DaoBook daoBookPort;

    public ServiceBooksList(DaoBook daoBookPort) {
        this.daoBookPort = daoBookPort;
    }

    public Collection<DtoBook> run() {
        return this.daoBookPort.getBookList();
    }

}
