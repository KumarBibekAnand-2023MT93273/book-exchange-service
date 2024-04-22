package com.bookexchange.bookexchangeservices.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookObj {
	
	@Getter@Setter
	private int bookId;
	
	@Getter@Setter
	private String bookName;
	
	@Getter@Setter
    private String message;
}
