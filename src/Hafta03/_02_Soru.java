package Hafta03;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {

        Scanner okuSayi   = new Scanner(System.in); // sayılar için bir tane
        Scanner okuKelime = new Scanner(System.in); // kelimeler için bir tane tanımlayalım her tür için.
        Scanner okuBoolean = new Scanner(System.in);

        System.out.print("Cadde = "); String cadde = okuKelime.nextLine();

        System.out.print("Sokak = "); String sokak = okuKelime.nextLine();

        System.out.print("Posta Kodu = "); int postaKod = okuSayi.nextInt();

        System.out.print("Ülke = "); String ulke = okuKelime.nextLine();

        System.out.print("Ev Sahibi Misiniz (true/false) = "); boolean evSahibi = okuKelime.nextBoolean();

        System.out.println("Adres = " + cadde+" " + sokak+" " +postaKod+ " "+ ulke+" " + evSahibi);


    }
}
