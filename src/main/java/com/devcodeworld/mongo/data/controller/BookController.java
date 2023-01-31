package com.devcodeworld.mongo.data.controller;

import com.devcodeworld.mongo.data.model.Book;
import com.devcodeworld.mongo.data.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/save")
    public String save(@RequestBody Book book) {
        Book savedBook = bookService.save(book);
        return "Added book with id " + savedBook.getId();
    }

    @GetMapping("/findAllBooks")
    public List<Book> findAllBooks() {
        return bookService.findAllBooks();
    }
}
