package Hafta08_2._02_Constructor_2;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Book() {
    }

    public Book(String name) { this.name = name; }

    public String toString() {
        return "Book{ "+ "name = '" + name + '\'' + ", publishYear =" + publishYear + ", author = '" + author + '\'' + '}';
    }
}

