package Hafta05;

public class _01_ArrayDizi {
    public static void main(String[] args) {
        int sayi;       // 1 tane sayı saklayacak hafıza bölgesi, adı da sayi
        float oran;     // 1 tane kesirli bölümü olabilen hafıza bölgesi, adı da oran

        sayi=5;         // sayi isimli hafıza kutusunun içinde 5 değeri var

        int ogrNot1;
        int ogrNot2;
        //...
        //...
        int ogrNot50;

        // 1 kalemde 50 tane değişken tanımlayabilmem lazım.
        // int den 50 tane hafıza kutusu ayır.
        int[] notlar = new int[50]; // Hafızada 50 kutucuk ayırayım.
        // notların 1. kutusuna 5 değerini at
        notlar[0]=5; // notlar isimli hafıza bölgesinin 0. kutusuna 5 değeri atıldı.
        notlar[1]=15;
        //...
        //...
        notlar[49]=45; // notlar isimli hafıza bölgesinin son kutusuna 45 değeri atıldı.

        System.out.println("notlar[0] yani 1. öğrencinin notu = " + notlar[0]); // 5 cumle.charAt(0).notlar[0]
        System.out.println("notlar[49] yani sonuncu öğrencinin notu = " + notlar[49]); // 45
        System.out.println("notlar.length = " + notlar.length); // 50 verecek
    }
}
