package Hafta02;

import java.util.Scanner;

public interface _25_JavaScanner {
    public static void main(String[] args) {
        // tipi adı    başlangı. değer
           int  sayi = 0;
        //tipi  adı       başlangıç değeri
        Scanner okuyucu = new Scanner(System.in); // System.in : klavyeden oku

        System.out.print("Sayi Giriniz ="); // ne istendiği bilinsin diye yazıldı
        int girilenSayi=okuyucu.nextInt(); // klavyeden int girilebilir

        System.out.println("girilenSayi = " + girilenSayi);




    }
}
