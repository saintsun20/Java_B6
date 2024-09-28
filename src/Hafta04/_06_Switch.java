package Hafta04;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra
        // Toplama için T, Çıkarma için Ç, Çarpma için P, Bölme için B,
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner oku = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        System.out.print("1. Sayı = ");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayı = ");
        int sayi2 = oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");
        System.out.print("Seçim = "); String secim = okuStr.next().toUpperCase();

/*
        if (secim.equals("T"))
            System.out.println("Toplam =" + " " + (sayi1+sayi2));
        else
        if (secim.equals("Ç"))
            System.out.println("Çıkarma =" + " " + (sayi1-sayi2));
        else
        if (secim.equals("P"))
            System.out.println("Çarpma =" + " " + (sayi1*sayi2));
        else
        if (secim.equals("B"))
            System.out.println("Bölme =" + " " + (sayi1/sayi2));  // önce seç sonra ctrl+/ satır başından itibaren
                                                                                    tüm seçileni açıklamaya çevirir.
 */

        // Çoklu if yapısı, SADECE EŞİTLİKLERDE kullanılabiliyor.
        switch (secim){
            case "T" :
                System.out.println("Toplam =" + " " + (sayi1+sayi2));
                break; // işlemi alt satıra geçme, çık
            case "Ç" :
                System.out.println("Çıkarma =" + " " + (sayi1-sayi2));
                break;
            case "P" :
                System.out.println("Çarpma =" + " " + (sayi1*sayi2));
                break;
            case "B" :
                System.out.println("Bölme =" + " " + (sayi1/sayi2));  // önce seç sonra ctrl+/
                break;
            default  :
                System.out.println("Hatalı Giriş");
        }
        // Çalışma Mantığı : Seçiminiz T ye eşitse case de ki karşılığını yap ve çık (break)
        // default : diğer şartlar gerçekleşmediyse, yukarıdaki tüm caselerin ELSE i gibi
    }
}
