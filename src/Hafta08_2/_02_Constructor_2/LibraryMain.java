package Hafta08_2._02_Constructor_2;

public class LibraryMain {
    public static void main(String[] args) {

        Book kit1 = new Book();
        kit1.name = "Kitap1";
        kit1.publishYear = 1995;
        kit1.author = "İsmet Temur";

        Book kit2 = new Book("Üzüm ve Çay");

        Book kit3 = new Book("Kitap2", 1996, "yazar1");

        System.out.println(kit1.toString());
        System.out.println(kit2);
        System.out.println(kit3);
    }
}
