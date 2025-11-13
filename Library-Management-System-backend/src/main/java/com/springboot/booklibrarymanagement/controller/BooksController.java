package com.springboot.booklibrarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.booklibrarymanagement.entity.Books;
import com.springboot.booklibrarymanagement.entity.ResponseStructure;
import com.springboot.booklibrarymanagement.service.BooksService;

import java.util.List;

@RestController
@RequestMapping("/books")


public class BooksController {

    @Autowired
    private BooksService booksService;

    // Add a new book
    @PostMapping
    public ResponseEntity<ResponseStructure<Books>> addBook(@RequestBody Books books) {
        return booksService.addBook(books);
    }

    // Get all books
    @GetMapping
    public ResponseEntity<ResponseStructure<List<Books>>> getAllBooks() {
        return booksService.getAllBooks();
    }

    // Get book by ID
    @GetMapping("/{id}")
    public ResponseEntity<ResponseStructure<Books>> getBookById(@PathVariable Long id) {
        return booksService.getBookById(id);
    }

    // Update book details
    @PutMapping
    public ResponseEntity<ResponseStructure<Books>> updateBook(@RequestBody Books books) {
        return booksService.updateBook(books);
    }

    // Delete book by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseStructure<String>> deleteBookById(@PathVariable Long id) {
        return booksService.deleteBookById(id);
    }
}
