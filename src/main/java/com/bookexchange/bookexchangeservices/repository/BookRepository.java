package com.bookexchange.bookexchangeservices.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookexchange.bookexchangeservices.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

    Book findByBookId(int bookId);
	
}
