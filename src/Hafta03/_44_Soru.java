package Hafta03;

import java.util.Scanner;

public class _44_Soru {
    public static void main(String[] args) {
        // yan yana aralarında bir boşlukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 456 67

        // sayıları giriniz= 23 2378
        // sayılar aynı anda yan yana boşluklu girilmesi lazım

        Scanner oku = new Scanner(System.in);
        System.out.print("Yan Yana 1 Boşluk ile 2 Adet Sayı Giriniz = ");
        String strSayilar = oku.nextLine(); // 4567 6

        int boslukIndex = strSayilar.indexOf(" "); // boşluk un index ini bulduk
        String strSayi1 = strSayilar.substring(0, boslukIndex); // 4567 //1.sayıyı bulduk
        String strSayi2 = strSayilar.substring((boslukIndex+1)); // 6 // 2. sayıyı bulduk

        if (strSayi1.equals((strSayi2))) // sayı görünümlü olsa da STRING olduklarından equals kullanılabilir.
            System.out.println("Eşit");
        else
            System.out.println("Değil");

    }
}
