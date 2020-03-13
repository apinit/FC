package com.example.fastCourse.controller;

import com.example.fastCourse.entity.Book;
import com.example.fastCourse.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getBooks")
    private List<Book> getAll() {
        List<Book> books = bookService.getAll();
        if(books != null) {
            if(books.size() > 0) {
                return books;
            }
        }
        return null;
    }

    @GetMapping("/getBook")
    private Book getOne(@RequestParam long id) {
        Book book = bookService.getOne(id);
        if(book != null) {
            return book;
        }
        return null;
    }

    @GetMapping("/getByName")
    private Book getByName(@RequestParam String name) {
        Book book = bookService.getByName(name);
        if(book != null) {
            return book;
        }
        return null;
    }

    @PostMapping("/addBook")
    private String addBook(@RequestBody Book book) {
        Book books = bookService.create(book);
        if(books != null) {
            return "Create success";
        }
        return "Can't create a book";
    }
}
