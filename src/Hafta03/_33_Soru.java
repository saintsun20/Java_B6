package Hafta03;

import java.util.Scanner;

public class _33_Soru {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi, çift mi olduğunu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi Giriniz = ");
        int sayi = oku.nextInt();

        if (sayi%2 == 0)
            System.out.println("Çift Sayı");

        if (sayi%2 == 1)
            System.out.println("Tek Sayi");


    }
}
