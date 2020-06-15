package com.carlos.api.books.domain.services;

import com.carlos.api.books.domain.exceptions.ExceptionsBook;
import com.carlos.api.books.domain.port.dao.DaoBook;
import com.carlos.api.books.shared.dto.DtoBook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ServiceBooksList {

    private static final Logger logger = LoggerFactory.getLogger(ServiceBooksList.class);

    private DaoBook daoBookPort;

    public ServiceBooksList(DaoBook daoBookPort) {
        this.daoBookPort = daoBookPort;
    }

    public Collection<DtoBook> run() {
        List<DtoBook> dtoBookList = new ArrayList<>();
        dtoBookList = this.daoBookPort.getBookList();

        if (dtoBookList.isEmpty()) {
            throw new ExceptionsBook("No se encontro registros en la Base de Datos");
        }
        logger.info("dtoBookList{}", dtoBookList);
        return this.daoBookPort.getBookList();
    }

}
