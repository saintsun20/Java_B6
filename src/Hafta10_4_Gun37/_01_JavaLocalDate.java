package Hafta10_4_Gun37;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate sadece gün ay yıl bilgisini verir/tutar
        LocalDate tarih = LocalDate.now();

        System.out.println("tarih = " + tarih); // normal gösterim
        System.out.println("tarih.getYear() = " + tarih.getYear()); // tarihi yıl kısmını
        System.out.println("tarih.getMonth() = " + tarih.getMonth()); // ayın adını
        System.out.println("tarih.getMonth().getValue() = " + tarih.getMonth().getValue()); // ayın nosu
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth()); // ayın kaçıncı günü
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek()); // haftanın günü isim olarak
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue()); // haftanın günü sayısı
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear()); // yılın günü

        // Formatlı Gösterimler
        // a- Sistemde hazır olan formatlarla gösterim
        System.out.println(" tarih = " + tarih.format(DateTimeFormatter.ISO_DATE) ); // uluslararası standart
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))); // 8/8/24 local short type
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))); // Aug 8, 2024
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))); // August 8, 2024
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL))); // Thursday, August 8, 2024

        // b- Kendi hazırladığımız şablonlarla gösterim
        System.out.println("*********  İstediğimiz formatta gösterim  **********");

        DateTimeFormatter ozelFormat1 = DateTimeFormatter.ofPattern("dd/MM/YYYY"); // tarih şablonu
        System.out.println("tarih dd/MM/YYYY = " + tarih.format(ozelFormat1)); // 08/08/2024

        DateTimeFormatter ozf2 = DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy = " + tarih.format(ozf2)); // 8.8.24

        DateTimeFormatter ozf3 = DateTimeFormatter.ofPattern("EEEE dd.MM.YYYY");
        System.out.println("tarih d.M.yy = " + tarih.format(ozf3)); // Thursday 08.08.2024

        DateTimeFormatter ozf4 = DateTimeFormatter.ofPattern("EE dd.MM.YYYY");
        System.out.println("tarih d.M.yy = " + tarih.format(ozf4)); // Thu 08.08.2024

        DateTimeFormatter ozf5 = DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.YYYY");
        System.out.println("tarih d.M.yy = " + tarih.format(ozf5)); // August Thursday 08.08.2024
    }
}
