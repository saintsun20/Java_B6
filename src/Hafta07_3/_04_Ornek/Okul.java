package Hafta07_3._04_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        Ogrenci ogr2 = new Ogrenci();
        Ogrenci ogr3 = new Ogrenci();

        int ogrNot1;
        int ogrNot2;
        int ogrNot3;
        int[] dizi = new int[50];

        Ogrenci[] ogrenciler = new Ogrenci[30];
        ArrayList<Ogrenci> sinif = new ArrayList<>();

        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        for (int i = 0; i < ogrenciler.length; i++) {
            Ogrenci ogr = new Ogrenci();
            System.out.println("Ad = "); ogr.ad = okuStr.nextLine();
            System.out.println("Soyad = "); ogr.soyad = okuStr.nextLine();
            System.out.println("Sınıf = "); ogr.sinif = okuInt.nextInt();
            System.out.println("Adres = "); ogr.adres = okuStr.nextLine();
            ogrenciler[i] = ogr;
        }

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i].ad);
            System.out.println(ogrenciler[i].soyad);
            System.out.println(ogrenciler[i].sinif);
            System.out.println(ogrenciler[i].adres);
        }


    }
}
