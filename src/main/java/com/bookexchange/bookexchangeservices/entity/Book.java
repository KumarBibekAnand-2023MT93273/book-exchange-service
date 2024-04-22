package com.bookexchange.bookexchangeservices.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="book")
@NamedQuery(name="Book.findAll", query="SELECT b FROM Book b")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="book_id", unique=true, length = 10)
	@Getter@Setter
	private int bookId;
	
	@Column(name="book_name", nullable=false, unique = true, length=255)
	@Getter@Setter
	private String bookName;
	
	@Column(nullable=false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@CreationTimestamp
	@Getter @Setter private Timestamp created;
	
}




