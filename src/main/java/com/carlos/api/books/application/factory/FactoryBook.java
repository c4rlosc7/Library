package com.carlos.api.books.application.factory;

import com.carlos.api.books.domain.model.entities.EntityDomainBook;
import com.carlos.api.books.infrastructure.persistence.entities.EntityBook;
import com.carlos.api.books.shared.dto.DtoBook;
import org.springframework.stereotype.Component;

@Component
public class FactoryBook {
    public EntityBook create(DtoBook book) {
        return new EntityBook(book.getIsbn(), book.getTitle(),
                            book.getSubtitle(), book.getAuthor(),
                            book.getPublished(), book.getPages(),
                            book.getDescription(), book.getWebsite(),
                            book.getState());
    }
}
