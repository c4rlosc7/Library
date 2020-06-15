package com.carlos.api.books.domain.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EntityDomainBook {

    private String isbn;
    private String title;
    private String subtitle;
    private String author;
    private String published;
    private int pages;
    private String description;
    private String website;
    private String state;

}
