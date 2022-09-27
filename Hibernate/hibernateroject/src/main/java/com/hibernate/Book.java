package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="book_info")
public class Book {
	@Id //for primary key(any field)
	@GeneratedValue(strategy = GenerationType.IDENTITY)//autogenerate id
	int bookId;
	@Column(name="book_name",length=50,nullable=false)//change name of filed in the database
	String bookName;
	@Column(name="book_price",length=10)
	double price;
	@Column(name="book_pages",length=5)
	int bookPages;
	@OneToOne
	private Author author;
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBookPages() {
		return bookPages;
	}
	public void setBookPages(int bookPages) {
		this.bookPages = bookPages;
	}
	public Book()
	{}
	
	public Book( String bookName, double price, int bookPages, Author author) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.bookPages = bookPages;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", bookPages=" + bookPages
				+ "]";
	}
	

}
