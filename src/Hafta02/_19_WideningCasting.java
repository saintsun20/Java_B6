package Hafta02;

public class _19_WideningCasting {
    public static void main(String[] args) {
        // küçük olan -> büyüğe atılabiliyor(genişletme-Widening)
        // byte -> short -> int -> long -> float -> double
        // veri kaybı kesinlikle yoktur.

        int sayi=9;
        long toplam=500;
        double oran=3.2;

        // sol taraf değer alan, sağ taraf değer veren taraftır.
        oran=sayi; // int -> long genişletme
        System.out.println("oran = " + oran); // veri kaybı yok

        toplam=sayi; // int -> long genişletme
        System.out.println("toplam = " + toplam); // veri kaybı yok

        oran=toplam; // long -> double
        System.out.println("oran = " + oran); // veri kaybı yok

    }
}
