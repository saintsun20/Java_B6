package Hafta05;

import java.util.Arrays;

public class _09_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // dizide kaç tek ve kaç çift olduğunu bulunuz.

        int[] dizi = new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random()*11);
        }

        System.out.println(Arrays.toString(dizi));
        int tekMiktar = 0, ciftMiktar = 0;
        for (int i = 0; i < 10; i++) {

            if (dizi[i] %2 == 0)
                ciftMiktar++;
            else
                tekMiktar++;
        }

        System.out.println("tekMiktar = " + tekMiktar);
        System.out.println("ciftMiktar = " + ciftMiktar);
    }

}
