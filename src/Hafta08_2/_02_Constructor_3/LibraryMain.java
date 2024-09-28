package Hafta08_2._02_Constructor_3;

public class LibraryMain {
    public static void main(String[] args) {
        Book kit1 = new Book();
        kit1.name = "Kitap1";
        kit1.author = "Yazar1";
        kit1.publishYear = 1995;

        Book kit2 = new Book("Üzüm ve Çay");

        Book kit3 = new Book("Kitap2", 1994, "Yazar");

        System.out.println("kit1 = " + kit1);
        System.out.println("kit2 = " + kit2);
        System.out.println("kit3 = " + kit3);

    }
}
