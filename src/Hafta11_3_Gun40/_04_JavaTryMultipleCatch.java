package Hafta11_3_Gun40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryMultipleCatch {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");

        Scanner oku = new Scanner(System.in);

        try {
            System.out.print("Sayi1=");
            int sayi1 = oku.nextInt();

            System.out.print("Sayi2=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

//            String kelime="";  Genel hatayı test için kullanılabilir
//            char harf=kelime.charAt(3);
        }
        catch(InputMismatchException ex) // giriş hatası
        {
            System.out.println("Lütffen sayı giriniz.");
        }
        catch(ArithmeticException ex) // 0 a bölme hatası
        {
            System.out.println("Lütffen 2. Sayıya 0 girmeyiniz.");
        }
        catch(Exception ex) // Genel hata, default
        {
            System.out.println("Hata oldu lütfen tekrar deneyiniz.");
        }

        System.out.println("Program bitti");
    }
}
