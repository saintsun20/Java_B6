package Hafta03;

import java.util.Scanner;

public class _40_Soru {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.
        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi = ");
        int sayi = oku.nextInt();

        if (sayi%2 == 0)
            System.out.println("Çift");
        else
            System.out.println("Tek");
    }
}
