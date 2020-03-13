package com.example.fastCourse.service;

import com.example.fastCourse.entity.Book;
import com.example.fastCourse.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book getOne(long bookId) {
        return bookRepository.findById(bookId);
    }

    public Book getByName(String name) {
        return bookRepository.findByName(name);
    }

    public Book create(Book book) {
        return bookRepository.save(book);
    }
}
