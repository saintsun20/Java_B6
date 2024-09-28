package Hafta03;

import java.util.Scanner;

public class _38_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan 2 kez gireceği şifresinin(String) aynı olduğu
        // AYNI veya DEĞİL şeklinde cevaplayınız. (confirm new password)

        Scanner oku = new Scanner(System.in);

        System.out.print("Şifrenizi Giriniz = ");
        String sifre = oku.nextLine();

        System.out.print("Şifrenizi Tekrar Giriniz = ");
        String sifreTekrar = oku.nextLine();

        if (sifre.equals(sifreTekrar)) // Şifreler eşit ise : true
            System.out.println("Şifreler AYNI");

        if (!sifre.equals(sifreTekrar)) // Şifreler eşit DEĞİLse
            System.out.println("Şifreler AYNI DEĞİL");
    }
}
