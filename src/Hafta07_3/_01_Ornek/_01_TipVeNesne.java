package Hafta07_3._01_Ornek;

// class, tip

import java.util.Scanner;

public class _01_TipVeNesne {

    // metod
    public static void main(String[] args) {
        // ana metod, start burası
        int sayi = 5;
        Scanner oku = new Scanner(System.in);

        Araba sabaninArabasi = new Araba(); // Araba tipinde ismi sabaninArabasi olan bir NESNE oluştur.
        sabaninArabasi.marka = "Mercedes";
        sabaninArabasi.renk = "Kırmızı";
        sabaninArabasi.motorHacmi = 3000;
        sabaninArabasi.yili = 2025;

        System.out.println("sabaninArabasi.yili = " + sabaninArabasi.yili);
        System.out.println("sabaninArabasi.renk = " + sabaninArabasi.renk);
        System.out.println("sabaninArabasi.marka = " + sabaninArabasi.marka);
        System.out.println("sabaninArabasi.motorHacmi = " + sabaninArabasi.motorHacmi);

    }

}

// class, tip lerin tanımlandığı yer

class Araba{
    String renk;
    int yili;
    String marka;
    double motorHacmi;


}

