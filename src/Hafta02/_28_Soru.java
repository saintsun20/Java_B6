package Hafta02;

import java.util.Scanner;

public class _28_Soru {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Adınızı ve Soyadınızı Giriniz = ");
        String adSoyad=oku.nextLine(); // next: SADECE bir kelime
                                       // nextLine : satırdaki bütün kelimeleri

        System.out.println("adSoyad = " + adSoyad);

    }
}
