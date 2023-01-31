package com.devcodeworld.mongo.data.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@Document(collection = "books")
public class Book {

    @Id
    private Integer id;
    private String name;
    private String author;
}
