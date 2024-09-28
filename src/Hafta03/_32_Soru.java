package Hafta03;

import java.util.Scanner;

public class _32_Soru {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını ekrana yazdırınız.
        // eşit ise eşit yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi 1 = ");
        int sayi1 = oku.nextInt();

        System.out.print("Sayi 2 = ");
        int sayi2 = oku.nextInt();

        if (sayi1 > sayi2)
            System.out.println("Sayi 1 büyük = "+ sayi1);

        if (sayi2 > sayi1)
            System.out.println("Sayi 2 büyük = "+ sayi2);

        if (sayi1 == sayi2)
            System.out.println("Sayilar eşit");


    }
}
