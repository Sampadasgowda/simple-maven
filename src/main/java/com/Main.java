package com;

import com.model.Author;
import com.model.Book;

public class Main {
	public static void main(String[] args) {
		
		Book book=new Book();
		book.setTitle("Java");
		Author author=new Author();
		author.setName("Herbertssss");
		book.setAuthor(author);
		System.out.println(book);
	}

}
 