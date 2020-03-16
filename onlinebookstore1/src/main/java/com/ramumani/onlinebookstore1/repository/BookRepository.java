package com.ramumani.onlinebookstore1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ramumani.onlinebookstore1.entity.Book;

@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long> {

}
