package Hafta05;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırınız.
        Scanner oku = new Scanner(System.in);

        int[] notlar = new int[5];

        int toplam = 0;
        for (int i = 0; i < notlar.length; i++) {
            System.out.print((i + 1) + " . Notu Giriniz = ");
            notlar [i] = oku.nextInt();

            toplam = toplam + notlar[i];
        }

        int ort = toplam / notlar.length; // 65
        System.out.println("ort = " + ort);
        
        int gecenSayisi = 0;
        for (int i = 0; i < notlar.length; i++) {

            if (notlar[i] >= ort) { // bu not ortalamayı GEÇİYOR ise
                System.out.println(notlar[i]);
                gecenSayisi++; // gecenSayisi = gecenSayisi+1
            }
        }

        System.out.println("gecenSayisi = " + gecenSayisi);
    }
}
