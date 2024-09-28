package Hafta10_4_Gun37;

import Utility.MyFunc;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _02_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate sadece gun ay yıl bilgisini tutar
        LocalDate tarih = LocalDate.now();

        DateTimeFormatter ozf6 = DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("tarih = " + tarih.format(ozf6));

        System.out.println("*** Alınan local tarihi, Başka dilde gösterim ***");
        System.out.println("Almanca Tarih = " + tarih.format(ozf6.withLocale(Locale.GERMAN)));

        // Localizasyon : ülke adı ve konuşulan dil adı
        // en-US        : Amerikanın ülkesinin ingilizce dili
        // en-UK        : İngiltere ülkesinin ingilizce dili
        // fr-CA        : Kanada ülkesinin Fransızca dili
        // en-CA        : Kanada ülkesinin İngilizce dili
        // tr*TR        : Türkiye ülkesinin Türkçe dili

        Locale lCince = new Locale("zh", "CH"); // Çince localizasyon tanımlandı, (DİL, ÜLKE)
        System.out.println("Çince Tarih = " + tarih.format(ozf6.withLocale(lCince)));

        Locale lTurkce = new Locale("tr", "TR"); // Türkçe localizasyon tanımlandı
        System.out.println("Türkçe Tarih = " + tarih.format(ozf6.withLocale(lTurkce)));

        //System.out.println(MyFunc.TurkceTarih());

        // Java içindeki Local Ülke ve Dil kodlarını nasıl görebilirim?
        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();

        for (Locale l : kullanilabilirLokaller)
        {
            System.out.println("Dili = " + l.getDisplayLanguage());
            System.out.println(", Ülkesi = " + l.getDisplayCountry());
            System.out.println(", Dili = " + l.getDisplayLanguage());
            System.out.println(", Ülke = " + l.getCountry());
        }

        System.out.println("***** Kendimiz Tarih Set Etme ********");
        LocalDate tarih1 = LocalDate.of(2035, 5, 20);
        LocalDate tarih2 = LocalDate.of(2053, Month.APRIL, 20);
        System.out.println("tarih2.format(ozf6) = " + tarih2.format(ozf6));
    }
}
