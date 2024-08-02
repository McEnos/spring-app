package com.example.springapp.repositories;

import com.example.springapp.models.Author;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends ReactiveCrudRepository<Author, Long> {
}