package com.carlos.api.books.infrastructure.persistence.jpa;

import com.carlos.api.books.infrastructure.persistence.entities.EntityBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPABook extends JpaRepository<EntityBook, Long> {
}
