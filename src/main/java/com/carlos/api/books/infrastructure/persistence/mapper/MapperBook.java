package com.carlos.api.books.infrastructure.persistence.mapper;

import com.carlos.api.books.domain.model.dto.DtoBook;
import com.carlos.api.books.infrastructure.persistence.entities.EntityBook;
import java.util.List;

public class MapperBook {

    public static List<DtoBook> transformListEntityToDto(List<EntityBook> booksListEntity) {
        List<DtoBook> listBooks = null;
        for (EntityBook book: booksListEntity) {
            listBooks.add(transformToDomain(book));
        }
        return listBooks;
    }

    public static DtoBook transformToDomain(EntityBook bookEntity) {
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
