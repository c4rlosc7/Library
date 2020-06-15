package com.carlos.api.books.application.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookSerializable implements Serializable {
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
