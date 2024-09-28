package Hafta04;

import java.util.Scanner;

public class _04_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra
        // Toplama için T, Çıkarma için Ç, Çarpma için P, Bölme için B,
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner oku = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        System.out.print("1. Sayı = ");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayı = ");
        int sayi2 = oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");
        System.out.print("Seçim = "); String secim = okuStr.next().toUpperCase();

            // Merdivenli if -> ladder if

        if (secim.equals("T"))
        System.out.println("Toplam =" + " " + (sayi1+sayi2));
        else
            if (secim.equals("Ç"))
                System.out.println("Çıkarma =" + " " + (sayi1-sayi2));
            else
                if (secim.equals("P"))
                    System.out.println("Çarpma =" + " " + (sayi1*sayi2));
                else
                    if (secim.equals("B"))
                        System.out.println("Bölme =" + " " + (sayi1/sayi2));

    }
}
