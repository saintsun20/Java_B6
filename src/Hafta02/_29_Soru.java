package Hafta02;

import java.util.Scanner;

public class _29_Soru {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Adınızı Giriniz = ");
        String ad = oku.nextLine(); // eğer birden fazla ismi var ise Line

        System.out.print("Soyadını Giriniz = ");
        String soyad = oku.nextLine(); // eğer birden fazla soyismi var ise Line

        System.out.println("Adınız ve Soyadınız = "+ ad+" "+ soyad);

    }
}
