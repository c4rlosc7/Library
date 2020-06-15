package com.carlos.api.books.infrastructure.persistence.mapper;

import com.carlos.api.books.infrastructure.persistence.entities.EntityBook;
import com.carlos.api.books.shared.dto.DtoBook;

import java.util.ArrayList;
import java.util.List;

public class MapperDtoBookToBookEntity {

    public static List<EntityBook> mapperListDtoBookToEntityBook(List<DtoBook> dtoBook) {
        List<EntityBook> listBooksEntityBooks = new ArrayList<>();
        for (DtoBook dto: dtoBook) {
            listBooksEntityBooks.add(mapperDtoBookToEntityBook(dto));
        }
        return listBooksEntityBooks;
    }

    public static EntityBook mapperDtoBookToEntityBook(DtoBook dtoBook) {
        EntityBook entityBook = new EntityBook();
        entityBook.setIsbn(dtoBook.getIsbn());
        entityBook.setTitle(dtoBook.getTitle());
        entityBook.setSubtitle(dtoBook.getSubtitle());
        entityBook.setAuthor(dtoBook.getAuthor());
        entityBook.setPublished(dtoBook.getPublished());
        entityBook.setPages(dtoBook.getPages());
        entityBook.setDescription(dtoBook.getDescription());
        entityBook.setWebsite(dtoBook.getWebsite());
        entityBook.setState(dtoBook.getState());
        return entityBook;
    }

}
