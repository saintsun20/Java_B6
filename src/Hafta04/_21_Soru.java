package Hafta04;

import java.util.Scanner;

public class _21_Soru {
    public static void main(String[] args) {
        // Kullanıcının gireceği 5 sayının toplamını bulunuz ve yazdırınız.
        Scanner oku = new Scanner(System.in);

        int toplam = 0;
        for (int i = 0; i < 5 ; i++) {
            System.out.print("Sayı Giriniz = "); int sayi= oku.nextInt();
            toplam = toplam+sayi;

        }

        System.out.println("toplam = " + toplam);







    }
}
