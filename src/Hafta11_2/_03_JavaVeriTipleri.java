package Hafta11_2;

import java.util.Arrays;

public class _03_JavaVeriTipleri {
    public static void main(String[] args) {

        // Java da 3 tane Veri Tipi var Bunlar: İlkel Tipler, Referans Tipler ve Nesne Tipler

        // İlkel tipler, içinde sadece bir değer tutan basit tipler double, boolean, int
        int sayi1=5;
        int sayi2=8;

        sayi1=sayi2;  // sayi 8 oldu, sayı zaten 8 di, SADECE değer aktarıldı kutular hala farklı
        sayi1=10;  // sayi 10 , sayi2 yine 8
        sayi2=20;  // sayi1 10, sayi2 20

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        // Referans Tipler
        int[] dizi1 = {5,6};
        int[] dizi2 = {1,2,3};

        dizi1 = dizi2; // hafıza kutuları aynı oldu
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));
        // Acaba dizi1 değiştirsem dizi2 etkilenir mi

        dizi1[0] = 50;
        System.out.println("dizi2 = " + Arrays.toString(dizi2));

        dizi2[1] = 100;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));

        // Nesne Tipler Double, Flot, Integer, Boolean, String
        // NULL alabilen veya değer ataması yapılmayabilen İLKEL tiplerdir.
        // Hafıza yerleşimi Referans Tip gibi, ama davranışı İLKEL gibi.

        String s1; // hafıza değer kutucuğu yok
        String s2 = null; // hafıza değer kutucuğu yok
        String s3 = ""; // değer atandı, hafıza değer kutucuğu oldu.
        String s4 = "İsmet"; // değer atandı değer kutucuğu var

        //s1.concat("merhaba"); // hafıza bölgesi yok, bi şey eklemeye çalışıyorsun,
        //s2.concat("merhaba"); // hafıza bölgesi yok, o yüzden çalışırken hata alacak

        //s1 = s1 + "merhaba"; // hiç çalıştırmaz
        s2 = s2 + "merhaba"; // normal çalışır
        System.out.println("s2 = " + s2);

        s3.concat("merhaba");
        s4.concat("merhaba");


    }
}
