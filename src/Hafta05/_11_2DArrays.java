package Hafta05;

import java.util.Scanner;

public class _11_2DArrays {
    public static void main(String[] args) {
        int sayi    = 5;       // 1 adet sayı saklıyor
        int[] dizi  = new int[10]; // 10 tane sayı saklıyor
        int[] dizi2 = {34,5,6,7,866,6,7,8};

        // Sınıf 3 ders için notlarını giricem
        int[] ders1Notlari = new int[50]; // 50 sayı not saklıyor
        int[] ders2Notlari = new int[50]; // 50 sayı not saklıyor
        int[] ders3Notlari = new int[50]; // 50 sayı not saklıyor

        // 2D Arrays, tablo
        int[][] tumNotlar = new int[3][50]; // 3*50 = 150 not saklıyor

        tumNotlar[0][0] = 65; // 0.Dersin, 8.Notu, 0.Dersin, 0.Sütunu

        Scanner oku = new Scanner(System.in);
        System.out.print("Not = ");
        tumNotlar[0][0] = oku.nextInt();    // 0.Dersin Notları
        tumNotlar[0][1] = oku.nextInt();
        tumNotlar[0][2] = oku.nextInt();
        //...
        tumNotlar[0][49] = oku.nextInt();

        tumNotlar[1][0] = oku.nextInt();    // 1.Dersin Notları
        tumNotlar[1][1] = oku.nextInt();
        tumNotlar[1][2] = oku.nextInt();
        //...
        tumNotlar[1][49] = oku.nextInt();

        tumNotlar[2][0] = oku.nextInt();    // 2.Dersin Notları
        tumNotlar[2][1] = oku.nextInt();
        tumNotlar[2][2] = oku.nextInt();
        //...
        tumNotlar[2][49] = oku.nextInt();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 50; j++) {
                System.out.print("Not =");
                tumNotlar[i][j] = oku.nextInt();
            }
        }

        for (int i = 0; i < tumNotlar.length; i++) { // satır sayısı

            for (int j = 0; j < tumNotlar[i].length; j++) { // i.satırın uzunluğu
                System.out.print("Not =");
                tumNotlar[i][j] = oku.nextInt();
            }
        }


    }
}
