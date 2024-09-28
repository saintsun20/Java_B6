package Hafta05;

import java.util.Scanner;

public class _20_Metodlar {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi = "); int sayi = oku.nextInt();

        // 1.yöntem
        if (sayi %2 == 0)
            System.out.println("Çift Sayı");
        else
            System.out.println("Tek Sayı");

        // 2.yöntem
        tekMiÇiftMiOkuYaz();
        tekMiÇiftMiOkuYaz();
        tekMiÇiftMiOkuYaz();

    }

    public static void tekMiÇiftMiOkuYaz(){
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi = "); int sayi = oku.nextInt();
        if (sayi %2 == 0)
            System.out.println("Çift Sayı");
        else
            System.out.println("Tek Sayı");

    }
}
