package com.carlos.api.books.domain.exceptions;

public class ExceptionsBook extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ExceptionsBook(String msn) {
        super(msn);
    }
}
