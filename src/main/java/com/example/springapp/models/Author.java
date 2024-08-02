package com.example.springapp.models;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    private Long id;

    @NotBlank
    private String lastname;

    private String firstname;

}