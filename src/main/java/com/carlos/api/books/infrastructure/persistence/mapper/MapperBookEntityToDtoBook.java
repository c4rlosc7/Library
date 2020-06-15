package com.carlos.api.books.infrastructure.persistence.mapper;

import com.carlos.api.books.infrastructure.persistence.entities.EntityBook;
import com.carlos.api.books.shared.dto.DtoBook;

import java.util.ArrayList;
import java.util.List;

public class MapperBookEntityToDtoBook {

    public static List<DtoBook> mapperListEntityBookToDtoBook(List<EntityBook> booksListEntity) {
        List<DtoBook> listBooks = new ArrayList<>();
        for (EntityBook book: booksListEntity) {
            listBooks.add(mapperEntityBookToDtoBook(book));
        }
        return listBooks;
    }

    public static DtoBook mapperEntityBookToDtoBook(EntityBook bookEntity) {
        DtoBook dtoBook = new DtoBook();
        dtoBook.setIsbn(bookEntity.getIsbn());
        dtoBook.setTitle(bookEntity.getTitle());
        dtoBook.setSubtitle(bookEntity.getSubtitle());
        dtoBook.setAuthor(bookEntity.getAuthor());
        dtoBook.setPublished(bookEntity.getPublished());
        dtoBook.setPages(bookEntity.getPages());
        dtoBook.setDescription(bookEntity.getDescription());
        dtoBook.setWebsite(bookEntity.getWebsite());
        dtoBook.setState(bookEntity.getState());
        return dtoBook;
    }
}
