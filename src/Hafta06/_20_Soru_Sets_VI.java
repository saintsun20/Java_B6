package Hafta06;

import Utility.MyFunc;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class _20_Soru_Sets_VI {
    public static void main(String[] args) {
        // 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
        // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
        // diziye atınız.

        Integer[] dizi=new Integer[10];

        for (int i = 0; i < 10; i++)
            dizi[i]= MyFunc.RndSayiVer(11);

        System.out.println("dizi = " + Arrays.toString(dizi));

        TreeSet<Integer> ts=new TreeSet<>();
        //1 yöntem
        for(Integer e : dizi)
            ts.add(e);

        System.out.println("ts = " + ts);

        //2.Yöntem
        TreeSet<Integer> ts2=new TreeSet<>( Arrays.asList(dizi) );
        System.out.println("ts2 = " + ts2);

        //3.Yöntem
        TreeSet<Integer> ts3=new TreeSet<>();
        Collections.addAll(ts3, dizi);
        System.out.println("ts3 = " + ts3);

    }
}
