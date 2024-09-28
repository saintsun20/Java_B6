package Hafta03;

import java.util.Scanner;

public class _39_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz
        // küçük ise kaldınız yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Notu Giriniz = ");
        int ogrNot = oku.nextInt(); // 60 girildi

        if (ogrNot >= 50) // böyle ise 60 girildiğinde burası çalıştı
            System.out.println("Tebrikler, Geçtiniz");

        if (!(ogrNot >= 50)) // böyle değil ise, 60 girildiğinde burası da kontrol edildi
            System.out.println("Üzgünüz, Kaldınız");

        // Daha İyi Yol
        if (ogrNot >= 50)
            System.out.println("Tebrikler, Geçtiniz");
        else // !(ogrNot >= 50) yani yukarıdaki ŞART geçerli değilse
            System.out.println("Üzgünüz, Kaldınız");
    }
}
