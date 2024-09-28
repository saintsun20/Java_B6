package Hafta08_2._02_Constructor_3;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book() {
//        this.name="";
//        this.publishYear=0;
//        this.author="";
        this("", 0, ""); // en geniş parametreli yapıcı metod çağrıldı
    }

    public Book(String name) {
        // this.name = name;
        // this.publishYear=0;
        // this.author="";
        this(name, 0, "");  // en geniş parametreli yapıcı metod çağrıldı
    }

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }
}

