package com.carlos.api.books.infrastructure.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="books")
@Getter
@Setter
@NoArgsConstructor
public class EntityBook implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String title;
    private String subtitle;
    private String author;
    private String published;
    private int pages;
    private String description;
    private String website;
    private String state;

    /**
     * Constructor with 9 arguments
     * @param isbn
     * @param title
     * @param subtitle
     * @param author
     * @param published
     * @param pages
     * @param description
     * @param website
     * @param state
     */
    public EntityBook(String isbn, String title, String subtitle, String author, String published, int pages, String description, String website, String state) {
        this.isbn = isbn;
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
        this.published = published;
        this.pages = pages;
        this.description = description;
        this.website = website;
        this.state = state;
    }

    /**
     * Serial Version
     */
    private static final long serialVersionUID = 1L;
}
