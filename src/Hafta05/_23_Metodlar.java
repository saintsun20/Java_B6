package Hafta05;

import java.util.Scanner;

public class _23_Metodlar {
    public static void main(String[] args) {
        // Main de Girilen 2 sayının toplama işlemini bir metodda yaparak yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi1 = "); int sayi1 = oku.nextInt();
        System.out.print("Sayi2 = "); int sayi2 = oku.nextInt();

        toplaYaz(sayi1,sayi2); // Math.max(45,78);
    }

    public static void toplaYaz(int a, int b)   // a=sayi1, b=sayi2
    {
        System.out.println("Toplam = " + (a+b));
    }
}
