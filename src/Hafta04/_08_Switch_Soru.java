package Hafta04;

import java.util.Scanner;

public class _08_Switch_Soru {
    public static void main(String[] args) {
        // Tek basamaklı girilen bir sayının değerini,
        // yazı ile yazdırınız.
        // mesela 1 -> bir, 2 -> iki gibi.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Basamaklı Sayı Giriniz = ");
        int sayi = oku.nextInt();

        switch (sayi){
            case 0 : System.out.println("Sıfır"); break;
            case 1 : System.out.println("Bir"); break;
            case 2 : System.out.println("İki"); break;
            case 3 : System.out.println("Üç"); break;
            case 4 : System.out.println("Dört"); break;
            case 5 : System.out.println("Beş"); break;
            case 6 : System.out.println("Altı"); break;
            case 7 : System.out.println("Yedi"); break;
            case 8 : System.out.println("Sekiz"); break;
            case 9 : System.out.println("Dokuz"); break;
            default: System.out.println("Hatalı Giriş");
        }
    }
}
