package com.carlos.api.books.infrastructure.settings;

import com.carlos.api.books.domain.port.dao.DaoBook;
import com.carlos.api.books.domain.services.ServiceBooksList;
import com.carlos.api.books.domain.services.ServiceCreateBook;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SettingsBean {

    @Bean
    public ServiceBooksList getBooksList(DaoBook daoBook) {
        return new ServiceBooksList(daoBook);
    }

    @Bean
    public ServiceCreateBook createBook() {
        // return new ServiceBooksList(daoBook);
        return null;
    }
}
