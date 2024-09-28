package Hafta06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _12_ArrayList {
    public static void main(String[] args) {
        // Arrays -> Array lerin kütüphane, onun metdolarını kullanıyor
        // ArrayList -> Collection metdolarını kullanılacak

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        //Sıralama
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Tersine çevirme
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Max ve Min i verebiliyor
        System.out.println("Collections.max(sayilar) = " + Collections.max(sayilar));
        System.out.println("Collections.min(sayilar) = " + Collections.min(sayilar));

        //bir değer tüm listi doldurma
        Collections.fill(sayilar,0);
        System.out.println("sayilar = " + sayilar);

        //Replace: arana elamnı, verilen ile değiştirir
        Collections.replaceAll(sayilar, 0,5);
        System.out.println("sayilar = " + sayilar);

        //tanılarken değer atama
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3,45,66,7,456));
        //int sayi=5;  int[] dizi={45,66,78,34,56};
        ArrayList<String> liste2=new ArrayList<>(Arrays.asList("ismet","mehmet","Ayşe","Veli"));
        System.out.println("liste2 = " + liste2);

        // Bir list e çoklu değer atama
        Collections.addAll(liste, 3,4,5,6,7);
        System.out.println("liste = " + liste);

        //diziyi bir liste direk atama
        Integer[] dizi2={34,55,67,8};
        ArrayList<Integer> liste4= new ArrayList<>(Arrays.asList(dizi2) );
        System.out.println("liste4 = " + liste4);

    }
}
