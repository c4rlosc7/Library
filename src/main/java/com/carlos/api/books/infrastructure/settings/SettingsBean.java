package com.carlos.api.books.infrastructure.settings;

import com.carlos.api.books.domain.port.dao.DaoBook;
import com.carlos.api.books.domain.services.ServiceBooksList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SettingsBean {

    @Bean
    public ServiceBooksList getBooksList(DaoBook daoBook) {
        return new ServiceBooksList(daoBook);
    }
}
