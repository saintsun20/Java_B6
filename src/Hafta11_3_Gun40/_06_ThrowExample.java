package Hafta11_3_Gun40;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.print("Yeni Şifrenizi giriniz=");
        String yeniSifre=oku.nextLine();

        if (yeniSifre.length() <8)
        {
            System.out.println("Lütfen dikkat!");
            System.out.println("Şifre en az 8 karakter olmalı ");
            // Log tutma
            // denem sayısı aşılırsa bloke etme işlemi
            // eski şifre aynı mı diye kontrol
        }

        if (yeniSifre.length() > 15)
        {
            System.out.println("Lütfen dikkat!");
            System.out.println("Şifre en fazla 15 karakter olmalı ");
            // Log tutma
            // denem sayısı aşılırsa bloke etme işlemi
            // eski şifre aynı mı diye kontrol
        }
    }
}
