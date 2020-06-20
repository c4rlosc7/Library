package com.carlos.api.books.infrastructure.controller.commands;

import com.carlos.api.books.application.handler.HandlerCreateBook;
import com.carlos.api.books.application.model.BookSerializable;
import com.carlos.api.books.infrastructure.persistence.entities.EntityBook;
import com.carlos.api.books.shared.dto.DtoBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/book")
public class ControllerCommands {
    private final HandlerCreateBook handlerCreateBook;

    @Autowired
    public ControllerCommands(HandlerCreateBook handlerCreateBook) {
        this.handlerCreateBook = handlerCreateBook;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public EntityBook create(@RequestBody DtoBook book) {
        return this.handlerCreateBook.run(book);
    }
}
