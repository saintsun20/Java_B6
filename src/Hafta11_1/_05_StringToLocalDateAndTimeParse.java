package Hafta11_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.format.DateTimeFormatter.ofPattern;

public class _05_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // Kullanıcının girdiği bir saat ve tarih ve her ikisini nasıl okuruz ?

        Scanner oku = new Scanner(System.in);
        System.out.println("Tarih Giriniz (13.08.2024 = ");
        String strTarih = oku.nextLine();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate tarih= LocalDate.parse(strTarih,f); // okunan stringi bu formata göre
        // Tarih e dönüştür

        System.out.println("tarih = " + tarih);
    }
}
