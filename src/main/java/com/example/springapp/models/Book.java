package com.example.springapp.models;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String title;

    private int page;

    private String isbn;

    private String description;

    private double price;
}