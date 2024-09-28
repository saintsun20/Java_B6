package Hafta08_2._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinif ;

    // Bu özel metodlara YAPICI metodlar denir : Constructor
    // nesne oluşturulurken yapılmasını istediklerimizi
    // burada yaptırabiliriz.
    Ogrenci() { // Çocuğun dünyaya gelme anı
        System.out.println("Nesne Oluşturulma Anı");
        System.out.println("Denize Git");
    }

    Ogrenci(int id, String ad,String soyad, int sinif) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif; // kendi sınıfına gelen sınıfı ata
    }
}
