package com.ramumani.onlinebookstore1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramumani.onlinebookstore1.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
