package Hafta06;

import Utility.MyFunc;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_Soru {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random olarak 20-200 arası sayılarla doldurunuz.
        // bu dizinin içindeki 3 katları olan sayıları bir Liste atayıp,
        // Listteki sayıların toplamını bulunuz.

        int[] dizi = new int[100];

        for (int i = 0; i < dizi.length; i++)
            dizi[i] = MyFunc.RndSayiVer(20,200);

        System.out.println("dizi = "+ Arrays.toString(dizi));

        ArrayList<Integer> ucler =  new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] %3 == 0)
                ucler.add(dizi[i]);

        }

        int toplam = 0;
        for (int i = 0; i < ucler.size(); i++)
            toplam=toplam+ucler.get(i);

        System.out.println("ucler = " + ucler);
        System.out.println("toplam = " + toplam);

    }
}

