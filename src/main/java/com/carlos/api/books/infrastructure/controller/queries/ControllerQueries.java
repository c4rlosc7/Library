package com.carlos.api.books.infrastructure.controller.queries;

import com.carlos.api.books.application.handler.HandlerBooksList;
import com.carlos.api.books.shared.dto.DtoBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("api/private/book")
public class ControllerQueries {
    private final HandlerBooksList handlerBooksList;

    @Autowired
    public ControllerQueries(HandlerBooksList handlerBooksList) {
        this.handlerBooksList = handlerBooksList;
    }

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public Collection<DtoBook> getBooksList() {
        return this.handlerBooksList.run();
    }
}
