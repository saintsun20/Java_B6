package Hafta04;

import java.util.Scanner;

public class _25_Soru {
    public static void main(String[] args) {
        // Kullanıcının gireceği 5 sayıdan sadece tek sayıların toplamını yazdırınız
        Scanner oku = new Scanner(System.in);

        int toplam = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Sayı Giriniz = "); int sayi = oku.nextInt();

            if (sayi%2==1 || sayi%2==-1); // sayı%2!=0  % işareti modu simgeler.
                toplam = toplam + sayi;
        }

        System.out.println("toplam = " + toplam);

    }
}
