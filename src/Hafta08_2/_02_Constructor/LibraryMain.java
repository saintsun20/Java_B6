package Hafta08_2._02_Constructor;

public class LibraryMain {
    public static void main(String[] args) {
        Book kit1 = new Book();
        kit1.name = "Harry Potter";
        kit1.author = "J.K. Rowling";
        kit1.publishYear = 1997;

        Book kit2 = new Book("Yüzüklerin Efendisi", 1954, "J.R.R. Tolkien");

        Book kit3 = new Book("Çay ve Kuru Üzüm");

        kit1.kitapYazdir();
        kit2.kitapYazdir();
        kit3.kitapYazdir();
    }

}
