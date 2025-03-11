package com.model;

public class Book {
    private String title;
    private Author author;  // Changed from String to Author object

    // Constructor
    public Book() {
        super();
    }

    public Book(String title, Author author) {
        super();
        this.title = title;
        this.author = author;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    // toString() method for better output
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author.getName() + "]";
    }
}
