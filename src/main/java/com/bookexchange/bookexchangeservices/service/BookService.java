package com.bookexchange.bookexchangeservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.bookexchange.bookexchangeservices.entity.Book;
import com.bookexchange.bookexchangeservices.model.BookObj;
import com.bookexchange.bookexchangeservices.repository.BookRepository;

import lombok.*;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
	


    public BookObj findBook(int bookId) {
    	BookObj response = new BookObj();
        Book book = getByBookId(bookId);
        if(null != book) {
            return BookObj.builder()
                    .bookId(book.getBookId())
                    .bookName(book.getBookName())
                    .build();
        } else
            response.setMessage("BOOK_NOT_FOUND");
        return response;
    }
    


    private Book getByBookId(int bookId) {
        return bookRepository.findByBookId(bookId);
    }


}
