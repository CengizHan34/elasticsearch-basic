package com.example.elasticsearchbasic.controller;

import com.example.elasticsearchbasic.model.Book;
import com.example.elasticsearchbasic.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Cengiz HAN on 03 Nov 2019
 */
@RestController
@RequestMapping("/api/book")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/save")
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }
}
