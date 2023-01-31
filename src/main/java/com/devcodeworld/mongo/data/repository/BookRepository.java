package com.devcodeworld.mongo.data.repository;

import com.devcodeworld.mongo.data.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {


}
