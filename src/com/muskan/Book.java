package com.muskan;
import java.util.Scanner;


public class Book {
	private int bookId;
	private String bookName;
	private String authorName;
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
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public static void main(String[] args) {
		Book b = new Book();
		b.setBookId(101);
		b.setBookName("the bell jar");
		b.setAuthorName("Sylvia plath");
		System.out.println("book name "+"\t"+"book id"+"\t"+"Author name");
		System.out.println(b.getAuthorName()+"\t"+b.getBookId()+"\t"+b.getBookName());
	}
}
