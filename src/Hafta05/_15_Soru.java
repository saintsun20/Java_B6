package Hafta05;

import java.util.Arrays;
import java.util.Scanner;

public class _15_Soru {
    public static void main(String[] args) {
        // Günün Sorusu : 3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemanlarını tek boyutlu bir
        // diziye atayınız.

        int[][] tablo = new int[3][2];
        Scanner oku = new Scanner(System.in);

        int teklerMiktarı = 0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(i + " " + j + " . Sayi = ");
                tablo[i][j] = oku.nextInt();

                if (tablo[i][j] %2 ==1)
                    teklerMiktarı++;
            }
        }

        int tekIndex = 0;
        int[] tekler = new int[teklerMiktarı]; // teklerin sayısı kadar dizi açtım
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j] %2 == 1)
                    tekler[tekIndex++] = tablo[i][j]; // tek boyutlu diziye at

            }

        }

        System.out.println("Tekler = " + Arrays.toString(tekler));
    }
}
