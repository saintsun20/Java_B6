package Hafta02;

import java.util.Scanner;

public class _26_Ornek {
    public static void main(String[] args) {

        //önce okuma komutunu tanımla aynı sayı tanımla gibi
        Scanner okuyucu = new Scanner(System.in); // komut tanımlandı

        System.out.println("Sayı Giriniz = ");
        int okudugunuVer=okuyucu.nextInt(); // sayı oku

        System.out.println("okudugunuVer = " + okudugunuVer);

    }
}
