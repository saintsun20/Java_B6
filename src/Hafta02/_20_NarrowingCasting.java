package Hafta02;

public class _20_NarrowingCasting {
    public static void main(String[] args) {
        // double -> float -> long -> int -> short -> byte
        // Narrowing Casting (manually) -> Büyük Kova -> Küçük Kovaya boşalıyor.

        int toplam=6700; // 2.5 mil
        byte sayi=5;     // -127 - 128

        sayi = (byte) toplam; // veri kaybı olmasa bile dikkatli olunmalı
        System.out.println("sayi = " + sayi); // veri kaybı var

        double oran=3.7;
        toplam = (int) oran; // double -> int
        System.out.println("toplam = " + toplam);
        // veri kaybı var, ondalık kısım kayboldu.

    }
}
