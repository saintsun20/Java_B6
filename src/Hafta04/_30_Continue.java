package Hafta04;

import java.util.Scanner;

public class _30_Continue {
    public static void main(String[] args) {
        // Kullanıcıdan alacağı 5 sayıdan sadece tekleri toplayınız
        Scanner oku = new Scanner(System.in);

        int toplam = 0;
        for (int i = 0; i < 5; i ++) {
            System.out.print("Sayı Giriniz = "); int sayi = oku.nextInt();

            if (sayi%2==1 || sayi%2==-1)
                toplam = toplam + sayi;
        }

        System.out.println("toplam = " + toplam);

        //2.yol
        for (int i = 0; i < 5; i++) {
            System.out.print("Sayı Giriniz = "); int sayi = oku.nextInt(); // 6

            if (sayi%2==0) // sayı çift ise pas geç
                continue; // çalıştığında kendinden sonrakine pass geçirir.

                toplam = toplam + sayi;
        }
    }
}
