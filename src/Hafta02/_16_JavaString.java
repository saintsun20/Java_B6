package Hafta02;

public class _16_JavaString {
    public static void main(String[] args) {
        int sayi=0; // int : değişkenin tipini, sayi: değişkenşn adını
                    // 0 : başlangıç değeri

        String ad="İsmet";

        System.out.println("sayi = " + sayi);
        System.out.println("ad = " + ad);

        String soyad="Temur";

        System.out.println("soyad = " + soyad);

        String tamAd=ad+" "+soyad; // İsmet Temur
        System.out.println("tamAd = " + tamAd); // 1.yol
        System.out.println("Tam Ad = "+ ad+" "+soyad); // 2.yol

        // çift tırnak arasındaki ifadeler aynen ekrana yazılır. diğerlerinin ise
        // değeri ekrana çıkar + ise bunları yan yana birleştirir.
        // String : kelimeleri saklamak için, int : tam sayıları saklamak için kullanılır.


    }
}
