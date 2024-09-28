package Hafta10_4_Gun37;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _03_JavaLocalTime {
    public static void main(String[] args) {
        // LocalTime : Tarih bilgisi içermez, sadece saat, dakika, saniye ve nanosaniye içerir.

        LocalTime saat = LocalTime.now();
        System.out.println("saat = " + saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        // Kendimiz format verebiliriz.
        System.out.println("*** Formatlı ***");

        DateTimeFormatter of1 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("saat hh:mm:ss = " + saat.format(of1));

        DateTimeFormatter of2 = DateTimeFormatter.ofPattern("kk:mm:ss");
        System.out.println("saat kk:mm:ss = " + saat.format(of2));

        DateTimeFormatter of3 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("saat hh:mm:ss a = " + saat.format(of3));
        
        // Kendimiz bir saat değerini set etme 
        LocalTime saat1 = LocalTime.of(17, 34, 45);
        System.out.println("saat1.format(of3) = " + saat1.format(of3));
    }
}
