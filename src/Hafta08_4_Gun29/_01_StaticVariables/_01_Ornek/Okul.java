package Hafta08_4_Gun29._01_StaticVariables._01_Ornek;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("İsmet", "Temur");
        Ogrenci ogr2 = new Ogrenci("Mehmet", "Yılmaz");
        Ogrenci ogr3 = new Ogrenci("Ayşe", "Kaya");
        //...
        //...
        Ogrenci ogr500 = new Ogrenci("Zeynep", "Yılmaz");
        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hafızada NESNE sayısı kadar
        // tekrarlanması engellendi.

        System.out.println(ogr1);
        System.out.println(ogr2);
        System.out.println(ogr3);
    }
}
