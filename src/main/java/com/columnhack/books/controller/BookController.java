package com.columnhack.books.controller;

import com.columnhack.books.model.Book;
import com.columnhack.books.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    @SchemaMapping(typeName = "Query", value = "allBooks")
    @QueryMapping
    public List<Book> allBooks(){
        return bookRepository.findAll();
    }

    @QueryMapping
    public Book findOne(@Argument Integer id){
        return bookRepository.findOne(id);
    }
}
