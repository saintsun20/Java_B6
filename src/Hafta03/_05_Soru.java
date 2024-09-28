package Hafta03;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //girilen bir stringin sadece son karakterini yazdırınız.
        /*
        String cumle="Selam Java Kursiyerleri";
        int uzunluk=cumle.length();

        char sonHarf=cumle.charAt( uzunluk-1);
        System.out.println("sonHarf = " + sonHarf);

         */

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cumle giriniz = ");
        String cumle=oku.nextLine(); // okuma kursörü burada çalışıyor.

        int uzunluk=cumle.length(); // uzunluğu buldum
        char sonHarf=cumle.charAt( uzunluk-1);

        System.out.println("sonHarf = " + sonHarf); // son karakteri yazdırdım.

        //2.yol
        System.out.println("sonKarakter = " + cumle.charAt(cumle.length()-1));









    }
}
