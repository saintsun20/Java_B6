package Hafta04;

import java.util.Scanner;

public class _03_JavaRandom {
    public static void main(String[] args) {
        // Girilen min ve max aralığa sayı üretiniz
        // Aralık için Kural : girilen aralık kadar sayı üret sonra alt sınırı ekle
        // Örneğin : 30 ile 70 arası Random Sayı istiyorsan
        // 70-30 yani 40 kadar sayı üret buna alt sınırı yani 30 u ekle

        Scanner oku = new Scanner(System.in);
        System.out.print("Alt Sınır Giriniz = "); int min = oku.nextInt();
        System.out.print("Üst Sınır Giriniz = "); int max = oku.nextInt();

        int aralik = max-min;

        int rndSayi = (int)(Math.random() * aralik) + min; // aralık kadar üret + min

        System.out.println("rndSayi = " + rndSayi);

    }
}
