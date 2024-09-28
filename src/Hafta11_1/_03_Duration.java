package Hafta11_1;

import java.time.Duration;
import java.time.LocalTime;

public class _03_Duration {
    public static void main(String[] args) {
        // Duration : içinde saat olan zamanların farkı
        // LocalTime ve LocalDateTime için sözkonusudur.
        long startTime = System.currentTimeMillis(); // şu andaki milisaniye cinsinden zamanı aldı

        LocalTime dersBaslangic = LocalTime.of(19, 0, 0);
        LocalTime dersBitis     = LocalTime.of(21, 50, 5);

        Duration gunlukDersSuresi = Duration.between(dersBaslangic,dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);

        System.out.println("toHours() = " + gunlukDersSuresi.toHours()); // toplamın saat hali
        System.out.println("toMinutes() = " + gunlukDersSuresi.toMinutes()); // toplamın dakika hali
        System.out.println("toSeconds() " + gunlukDersSuresi.getSeconds());// toplamın saniye hali

        System.out.println("*******************************************");
        long finishTime = System.currentTimeMillis();
        System.out.println("Geçen Süre = " + (finishTime-startTime) + " ms ");
        // Kod ne kadar sürede çalıştı


    }
}
