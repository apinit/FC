package com.example.fastCourse.repository;

import com.example.fastCourse.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findById(long id);

    Book findByName(String name);
}
