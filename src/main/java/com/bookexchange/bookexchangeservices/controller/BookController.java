package com.bookexchange.bookexchangeservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookexchange.bookexchangeservices.model.BookObj;
import com.bookexchange.bookexchangeservices.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
    BookService bookService;
	
	@GetMapping("/{bookId}/findBook")
    public BookObj findBook
            (@PathVariable("bookId") int book) {
        return bookService.findBook(book);
    }


}
