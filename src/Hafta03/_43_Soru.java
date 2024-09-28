package Hafta03;

import java.util.Scanner;

public class _43_Soru {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 50 tl, 5 saate kadar 100 tl, 5 den büyükse 120 tl dir.
        // kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız.

        // EĞER saat <= 3 ise 50 tl yaz
        // EĞER saat > 3 && saat <= 5 ise 100 tl yaz
        // EĞER saat > 5 ise 120 tl yaz

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Saat Giriniz = ");
        int saat = oku.nextInt();

        if (saat <= 3)
            System.out.println("50 ₺"); // ₺ : alt gr+t
        System.out.println("Ödeme İçin TEŞEKKÜRLER!");

        if (saat > 3 && saat <= 5)
            System.out.println("100 ₺");

        if (saat > 5)
            System.out.println("120 ₺");


        // 2.yol
        if (saat <= 3)
            System.out.println("50 ₺");
        else { // 3 saatten fazla kaldı
            if (saat <= 5)
                System.out.println("100 ₺");
            else  // saat>5
                System.out.println("120 ₺");
        }
    }
}
