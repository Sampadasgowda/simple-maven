package com.model;

public class Author {
    private String name;

    // Constructor
    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString() method for easy debugging
    @Override
    public String toString() {
        return "Author{name='" + name + "'}";
    }
}
