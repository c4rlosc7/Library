package com.carlos.api.books.infrastructure.controller.health;

import com.carlos.api.ApiApplicationTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Health Get Controller Test Class")
class HealthGetControllerTest extends ApiApplicationTests {

    @Test
    @DisplayName("Testing endpoint: { 'status': 'ok' } ")
    void indexHealthCkeckTest() throws Exception {
        assertResponse("/api/book/health", 200, "{ 'status': 'ok' }");
    }
}