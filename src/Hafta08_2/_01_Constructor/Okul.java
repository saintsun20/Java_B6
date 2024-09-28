package Hafta08_2._01_Constructor;

import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        Ogrenci ogr1 = new Ogrenci();// yeni çocuk
        ogr1.id = 1;
        ogr1.ad = "İsmet";
        ogr1.soyad = "Temur";
        ogr1.sinif = 5;

        System.out.println(ogr1.ad);
        yazdir();

        Ogrenci ogr2 = new Ogrenci(2, "Mehmet", "Yılmaz", 6);
        System.out.println(ogr2.ad);
    }

    public static void yazdir()
    {

    }
}
