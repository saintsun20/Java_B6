package Hafta03;

public class _12_StringSubstring {
    public static void main(String[] args) {
        // Substring    : string den parça alır
        //      01234567890123456789

        String s1="Merhaba Java yı sevenler derneği üyeleri";

        String parca1=s1.substring(8,12); // 8 den başla 12 ye KADAR al, 12 dahil değil
        System.out.println("parca1 = " + parca1); // istenilen son sınırın 1 fazlası yazılır

        System.out.println("parca2 = " + s1.substring(0,7)); // Merhaba

        System.out.println("parca3 = " + s1.substring(8)); // üst sınırı vermezseniz sonuna kadar alır.

    }
}
