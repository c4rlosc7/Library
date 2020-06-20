package com.carlos.api.books.infrastructure.controller.health;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;

@RestController
@RequestMapping("api/book")
public class HealthGetController {

    @GetMapping("/health")
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, String> index() {

        HashMap<String, String> status = new HashMap<>();
        status.put("status", "ok");

        return status;
    }
}
