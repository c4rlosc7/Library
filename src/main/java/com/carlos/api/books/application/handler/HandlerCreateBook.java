package com.carlos.api.books.application.handler;

import com.carlos.api.books.application.factory.FactoryBook;
import com.carlos.api.books.domain.model.entities.EntityDomainBook;
import com.carlos.api.books.domain.services.ServiceCreateBook;
import com.carlos.api.books.infrastructure.persistence.entities.EntityBook;
import com.carlos.api.books.shared.dto.DtoBook;
import org.springframework.stereotype.Component;

@Component
public class HandlerCreateBook {
    private final FactoryBook factoryBook;
    private final ServiceCreateBook serviceCreateBook;

    public HandlerCreateBook(FactoryBook factoryBook, ServiceCreateBook serviceCreateBook) {
        this.factoryBook = factoryBook;
        this.serviceCreateBook = serviceCreateBook;
    }

    public EntityBook run(DtoBook book) {
        // EntityBook entityBook = this.factoryBook.create(book);
        return this.serviceCreateBook.run(book);
    }
}
