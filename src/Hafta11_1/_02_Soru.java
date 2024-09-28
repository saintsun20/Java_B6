package Hafta11_1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    public static void main(String[] args) throws InterruptedException {
        // Şu anki saati alınan saati geriye doğru saniye saniye saydırınız.

        // zamanı bir kere al
        LocalTime saat = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("kk:mm:ss"); // 24 saat formatı

        while(true) {
            System.out.print("\r" + saat.format(f));
            saat = saat.minusSeconds(1); // 1 sn azalt
            Thread.sleep(1000);
        }
    }
}
