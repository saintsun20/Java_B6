package Hafta05;

import java.util.Scanner;

public class _21_Metodlar {
    public static void main(String[] args) {
        // kullanıcıdan alınan bir sayının tek mi çift mi olduğunu bulunuz
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi = "); int sayi = oku.nextInt();

        tekMiCiftMiYaz(sayi); // sayı metoda gönderildi

    }
    // gönderilen sayının değeri, metoda gelenSayi olarak geçirildi
    // metod gelen sayıya gelenSayi adını verdi metodun içine aldı
    public static void tekMiCiftMiYaz(int gelenSayi){       // sayi=gelenSayi
        if (gelenSayi %2 == 0)
            System.out.println("Çift Sayı");
        else
            System.out.println("Tek Sayı");

    }
}
