package Hafta05;

import java.util.Scanner;

public class _24_Soru {
    public static void main(String[] args) {
        // Mainde girilen 2 sayıdan büyük olanını bir metodda bularak yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi1 = "); int sayi1 = oku.nextInt();
        System.out.print("Sayi2 = "); int sayi2 = oku.nextInt();

        enBuyukBulYaz(sayi1,sayi2);
        //Math.max(sayi1,sayi2);
    }

    public static void enBuyukBulYaz(int sayi1, int sayi2){
        if (sayi1 > sayi2)
            System.out.println(sayi1);
        else
            System.out.println(sayi2);
    }
}
