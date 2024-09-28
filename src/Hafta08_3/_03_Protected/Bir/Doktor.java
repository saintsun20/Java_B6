package Hafta08_3._03_Protected.Bir;

public class Doktor {
    public String hastaneAdi; // herkes erişebilir
    String adi; // aynı pakettekiler
    private String sicilNo; // Sadece classın içinden erişilebilir
    protected String bolum; // default gibi

    Doktor() { // kendi paketindeler

    }

    public Doktor(String adi) {
        this.adi = adi;
    }
}
