package com.example.springapp.service;

import com.example.springapp.models.Book;

import java.util.List;

public interface BookService {
    public Book create(Book book);

    Book update(Book book);

    Book getOne(String id);

    List<Book> getAll();

    void delete(String id);
}
