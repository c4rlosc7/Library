package com.carlos.api.books.application.handler;

import com.carlos.api.books.domain.model.dto.DtoBook;
import com.carlos.api.books.domain.services.ServiceBooksList;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class HandlerBooksList {
    private ServiceBooksList srvBooksList;

    public HandlerBooksList(ServiceBooksList srvBooksList) {
        this.srvBooksList = srvBooksList;
    }

    public Collection<DtoBook> run() {
        return this.srvBooksList.run();
    }
}
