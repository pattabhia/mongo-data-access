package com.devcodeworld.mongo.data.service;

import com.devcodeworld.mongo.data.exception.ResourceNotFoundException;
import com.devcodeworld.mongo.data.model.Book;
import com.devcodeworld.mongo.data.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findById(Integer id) {
        Optional<Book> byId = bookRepository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        } else {
            throw new ResourceNotFoundException(id);
        }
    }
}
