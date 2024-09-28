package Hafta03;

import java.util.Scanner;

public class _41_Soru {
    public static void main(String[] args) {
        // Girilen sayı pozitif ve tek sayı ise, ekrana uygun sayı girildi
        // değilse uygun sayı girilmedi şeklinde yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = oku.nextInt();

        if (sayi > 0 && sayi%2 == 1)
            System.out.println("Uygun Sayı Girildi");
        else
            System.out.println("Uygun Sayı Girilmedi");

    }
}
