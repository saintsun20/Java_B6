package Hafta07_4_Gun25._04_Soru;

public class EnerjiSa {
    public static void main(String[] args) {
        Musteri mus1 = new Musteri();

        mus1.name="Aziz Güneş";
        mus1.eHesap.tuketimEkle(100); // Ocak
        mus1.eHesap.tuketimEkle(200); // Şubat
        mus1.eHesap.tuketimEkle(300); // Mart

        mus1.eHesap.ToplamTuketimYaz();
        mus1.eHesap.FaturaYaz();


    }

    }

