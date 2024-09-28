package Hafta03;

import java.util.Scanner;

public class _31_Soru {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi, pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("Sayı Giriniz = ");
        int sayi= oku.nextInt();

        // eğer sayı > 0 ise pozitif yaz
        if (sayi>0)
            System.out.println("Pozitif");

        // eğer sayı < 0 ise negatif yaz
        if (sayi<0)
            System.out.println("Negatif");

        // eğer sayı 0 a eşit ise sıfır yaz
        if (sayi==0)
            System.out.println("Sıfır");

    }
}
