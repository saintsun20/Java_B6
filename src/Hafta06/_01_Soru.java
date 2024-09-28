package Hafta06;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // kullanıcı ile 5 elemanlı bir diziyi main de doldurduktan sonra
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız.

        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[5];

        // Kullanıcı ile 5 elemanlı bir diziyi main de oluşturalım
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + " . Sayı = ");
            dizi[i] = oku.nextInt();
        }

        enBuyukBulYaz(dizi);
        enKucukBulYaz(dizi);
        ortalamaBulYaz(dizi);

    }

    public static void enBuyukBulYaz(int[] dizi){
        Arrays.sort(dizi);
        System.out.println("En Büyük = " + dizi[dizi.length - 1]);

    }

    public static void enKucukBulYaz(int[] dizi){
        Arrays.sort(dizi);
        System.out.println("En Küçük = " + dizi[0]);

    }

    public static void ortalamaBulYaz(int[] dizi){
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam = toplam + dizi[i];
        }

        int ort = toplam / dizi.length;
        System.out.println("ort = " + ort);
    }
}

