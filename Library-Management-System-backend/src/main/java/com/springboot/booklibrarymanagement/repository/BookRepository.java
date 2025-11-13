package com.springboot.booklibrarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.booklibrarymanagement.entity.Books;

public interface BookRepository extends JpaRepository<Books, Long> {
	
	

}
