package com.springboot.booklibrarymanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.booklibrarymanagement.dao.BooksDao;
import com.springboot.booklibrarymanagement.entity.Books;
import com.springboot.booklibrarymanagement.entity.ResponseStructure;
import com.springboot.booklibrarymanagement.exception.BooksNotFoundException;

@Service
public class BooksService {

    @Autowired
    private BooksDao booksDao;

    // Add Book
    public ResponseEntity<ResponseStructure<Books>> addBook(Books books) {
        Books savedBook = booksDao.addBooks(books);

        ResponseStructure<Books> structure = new ResponseStructure<>();
        structure.setStatusCode(HttpStatus.CREATED.value());
        structure.setMsg("Book added successfully");
        structure.setData(savedBook);

        return new ResponseEntity<>(structure, HttpStatus.CREATED);
    }

    // Get All Books
    public ResponseEntity<ResponseStructure<List<Books>>> getAllBooks() {
        List<Books> booksList = booksDao.getAllBooks();

        ResponseStructure<List<Books>> structure = new ResponseStructure<>();
        structure.setStatusCode(HttpStatus.OK.value());
        structure.setMsg("Books fetched successfully");
        structure.setData(booksList);

        return new ResponseEntity<>(structure, HttpStatus.OK);
    }

    // Get Book by ID
    public ResponseEntity<ResponseStructure<Books>> getBookById(Long id) {
        Optional<Books> recBook = booksDao.getBookById(id);

        if (recBook.isEmpty()) {
            throw new BooksNotFoundException("Book not found with ID: " + id);
        }

        ResponseStructure<Books> structure = new ResponseStructure<>();
        structure.setStatusCode(HttpStatus.OK.value());
        structure.setMsg("Book found successfully");
        structure.setData(recBook.get());

        return new ResponseEntity<>(structure, HttpStatus.OK);
    }

    // Update Book by ID
    public ResponseEntity<ResponseStructure<Books>> updateBook(Books books) {
        Books updatedBook = booksDao.updateBooksById(books);

        ResponseStructure<Books> structure = new ResponseStructure<>();
        structure.setStatusCode(HttpStatus.OK.value());
        structure.setMsg("Book updated successfully");
        structure.setData(updatedBook);

        return new ResponseEntity<>(structure, HttpStatus.OK);
    }

    // Delete Book by ID
    public ResponseEntity<ResponseStructure<String>> deleteBookById(Long id) {
        boolean deleted = booksDao.deleteById(id);

        if (!deleted) {
            throw new BooksNotFoundException("Book not found with ID: " + id);
        }

        ResponseStructure<String> structure = new ResponseStructure<>();
        structure.setStatusCode(HttpStatus.OK.value());
        structure.setMsg("Book deleted successfully");
        structure.setData("Book ID " + id + " has been removed.");

        return new ResponseEntity<>(structure, HttpStatus.OK);
    }
}
