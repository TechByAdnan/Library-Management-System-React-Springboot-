package com.springboot.booklibrarymanagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.booklibrarymanagement.entity.Books;
import com.springboot.booklibrarymanagement.repository.BookRepository;

@Repository
public class BooksDao {

    @Autowired
    private BookRepository booksRepository;

    // Add book
    public Books addBooks(Books books) {
        return booksRepository.save(books);
    }

    // Get all books
    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }

    // Get book by id
    public Optional<Books> getBookById(Long id) {
        return booksRepository.findById(id);
    }

    // Update book by id
    public Books updateBooksById(Books books) {
        return booksRepository.save(books);
    }

    // Delete book by id
    public boolean deleteById(Long id) {
        Optional<Books> recBook = getBookById(id);
        if (recBook.isPresent()) {
            booksRepository.delete(recBook.get());
            return true;
        }
        return false;
    }
}
