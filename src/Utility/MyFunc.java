package Utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MyFunc {

    public static int RndSayiVer(int alt, int ust) {
        return (int) (Math.random() * (ust - alt)) + alt;
    }

    public static int RndSayiVer(int max) {
        return (int) (Math.random() * max);
    }

    public static String TurkceTarih() {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter ozf6 = DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        Locale lTurkce = new Locale("tr", "TR"); // Türkçe localizasyon tanımlandı
        return tarih.format(ozf6.withLocale(lTurkce));
    }
}

