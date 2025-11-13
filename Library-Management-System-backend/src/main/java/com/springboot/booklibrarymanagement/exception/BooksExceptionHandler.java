package com.springboot.booklibrarymanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springboot.booklibrarymanagement.entity.ResponseStructure;

@ControllerAdvice
public class BooksExceptionHandler {

    @ExceptionHandler(BooksNotFoundException.class)
    public ResponseEntity<ResponseStructure<String>> handleBNFE(BooksNotFoundException exception) {
        ResponseStructure<String> structure = new ResponseStructure<>();
        structure.setMsg(exception.getMessage());
        structure.setStatusCode(HttpStatus.NOT_FOUND.value());
        structure.setData("Books not found");

        return new ResponseEntity<>(structure, HttpStatus.NOT_FOUND);
    }
}
