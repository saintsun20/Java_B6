package Hafta03;

public class _06_StringIndexOf {
    public static void main(String[] args) {
        // IndexOf(harf/ler) -> verilen harf/ler in Index ini ver.
        // Bugün        indexOf("g")  -> 2
        //              indexOf("ün") -> 3

        String cumle="Merhaba Dünya";
        // b nin oda numarası kaç ? 5

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M")); // 0
        System.out.println("cumle.indexOf(h) = " + cumle.indexOf("h")); // 3
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4 ilkini verir
        System.out.println("cumle.indexOf(Dü) = " + cumle.indexOf("Dü")); // 8
        System.out.println("cumle.indexOf(' ') = " + cumle.indexOf(" ")); // 7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); // -1
        System.out.println("cumle.indexOf(z) = " + cumle.indexOf("z")); // -1 yok

        System.out.println("cumle.indexOf(a,5) = " + cumle.indexOf("a",5)); // 6
                            // 5 den sonra a yı ara, bulursan index ini ver

        System.out.println("cumle.indexOf(a,7) = " + cumle.indexOf("a",7)); // 12
                           // 7 den sonra a yı ara, bulursan index ini ver


    }
}
