package Hafta11_3_Gun40;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.print("Yeni Şifrenizi giriniz=");
        String yeniSifre = oku.nextLine();

        try {
            if (yeniSifre.length() < 8)
                throw new Exception("Şifre en az 8 karakter olmalı");
            // throw new Exception : sanal hata oluştur catch e düşmek için

            if (yeniSifre.length() > 15)
                throw new Exception("Şifre en fazla 15 karakter olmalı ");

        } catch (Exception ex) {
            System.out.println("Lütfen Dikkat");
            System.out.println(ex.getMessage());
            // Log tutma
            // denem sayısı aşılırsa bloke etme işlemi
            // eski şifre aynı mı diye kontrol
        }
    }
}
