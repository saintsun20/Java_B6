package Hafta03;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı örneğin "Ismet Temur" -> I.T.şeklinde yazdırınız.
        // 2 isim yok sadece ad ve soyad var

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız Soyadınız = "); String adSoyad=oku.nextLine(); // Aziz Güneş

        int boslukIndex=adSoyad.indexOf(" "); // boşluğun index ini buluyoruz.
        char soyadIlkharf=adSoyad.charAt(boslukIndex+1);

        System.out.println(adSoyad.charAt(0) + "." + soyadIlkharf+".");



    }
}
