package Hafta11_3_Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");

        try { // dene, hatanın başladığı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2024, Month.FEBRUARY, 30);
        } // hatanın bittiği yer, hata olduğu zaman programı kırma
        catch (Exception ex)
        {   // ex isimli değişkende oluşan hataların bilgisi atanıyor
            //hata oldugunda yapılması istenenler buraya yazılıyor

            System.out.println("Lütfen tekrar deneyiniz");
            System.out.println("Tüm hata mesajı="+ex); // hata özeti
            System.out.println(Arrays.toString(ex.getStackTrace())); // Ayrıntılı hata mesajı
            // log tutma: bu hataları al bir yere kaydet, daha sonra programı
            // iyileştirmek için kullan
            // windows hataları arka planda toplayıp microsoft a gönderiyor,
        }


        System.out.println("Program bitti");

        try{
            // JAva ve toolları çalışmaya devam edeceğiz
            // Konuları dikkatlice dinleyip
            // projeler tam katılım
        }  // anlamadığın bir yer olduğunda , kırılmadan CATCH den devam et
        catch(Exception ex)
        {
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // gerekiyor ise videoları izle
            // Grup arkadaşlarına sor
            // Mentöre veya Hocaya sor
            // Kırılmadna öğrenmeye devam et
            // Unutma sen söz verdin.
        }

        // sonunda seni İnş. güzel bir meslek bekliyor.

    }
}
