package Hafta04;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız.
        // Kullanıcı bilirse tebrikler yazdırınız
        // Mesela 5 girersem 5 e kadar sayı üretsin, ben tahmin etmeye çalışayım.

        Scanner oku = new Scanner(System.in);

        System.out.print("Kaça Kadar Sayı Tutayım = ");
        int ustSinir = oku.nextInt();

        int rndSayi = (int) (Math.random()*ustSinir); // 1-5 arası sayı üretecek

        System.out.print("Tahmininiz = ");
        int tahmin = oku.nextInt();

        if (rndSayi == tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemedin ki! Bilemedin ki!" + " " + rndSayi);



        ;
    }
}
