package Hafta06;

import Utility.MyFunc;

import java.util.Arrays;

public class _07_Soru {
    public static void main(String[] args) {
        // 50 elamanlı bir diziyi 20-100 kadar olan random sayılarla doldurunuz.
        // Diziyi bir metoda gönderip, tek elemanların toplamını main de yazdırınız.
        int[] dizi = new int[50];

        for (int i = 0; i < dizi.length; i++)
            dizi[i] = MyFunc.RndSayiVer(20,100);

        System.out.println(Arrays.toString(dizi));

        int tektoplam = teklerToplam(dizi);
        System.out.println("tektoplam = " + tektoplam);
    }

    public static int teklerToplam(int[] dizi){
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++)
            if (dizi[i] %2 == 1)
                toplam = toplam+dizi[i];

        return toplam;
    }

}
