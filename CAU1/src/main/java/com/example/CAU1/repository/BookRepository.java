package com.example.CAU1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CAU1.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}
