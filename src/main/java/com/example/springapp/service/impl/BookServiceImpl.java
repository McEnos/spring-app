package com.example.springapp.service.impl;

import com.example.springapp.models.Book;
import com.example.springapp.repositories.BookRepository;
import com.example.springapp.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book create(Book book) {
        try {
            return bookRepository.save(book);

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Book update(Book book) {
        try {
            return bookRepository.update(book);

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Book getOne(String id) {
        try {
            return bookRepository.findById(id).orElse(null);

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public List<Book> getAll() {
        try {
            return bookRepository.findAll();

        } catch (Exception ex) {
            return Collections.emptyList();
        }
    }

    @Override
    public void delete(String id) {
        bookRepository.deleteById(id);
    }
}
