package Hafta02;

public class _21_Ornek {
    public static void main(String[] args) {
        // 10 / 3  -> 3.33333333
        // yukarıdaki bölmeyi bilgisayar nasıl yapar
        // int / int -> ben sonucu int yani tam sayı kısmını veririm.
        // 10 / 3 -> 3 verecek

        // Ama ben sonucu EĞER küsüratlı istiyorsam ne yapmam gerekir?
        // işleme girenlerden birisi double olursa sonucu double veririm
        // 10 / (double)3   , 10/3.0  -> 3.333333

        int sayi1=10;
        int sayi2=3;

        int tamSonuc = sayi1 / sayi2 ; // 3 ?
        System.out.println("tamSonuc = " + tamSonuc);

        // küsüratlı sonuç nasıl alırdım.
        double doubleSonuc = sayi1 / (double) sayi2; // 3.333333
        System.out.println("doubleSonuc = " + doubleSonuc);






    }
}
