package Hafta07_3._03_Ornek;

import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        System.out.print("Ogr Adı = "); ogr1.adi = okuStr.nextLine();
        System.out.print("Ogr Soyadı = "); ogr1.soyadi = okuStr.nextLine();
        System.out.print("Ogr Sınıfı = "); ogr1.sinifi = okuInt.nextInt();
        System.out.print("Ogr Adresi = "); ogr1.adres = okuStr.nextLine();

        System.out.println(ogr1.adi);
        System.out.println(ogr1.soyadi);
        System.out.println(ogr1.sinifi);
        System.out.println(ogr1.adres);


    }
}
