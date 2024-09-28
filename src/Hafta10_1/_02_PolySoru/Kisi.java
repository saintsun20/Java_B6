package Hafta10_1._02_PolySoru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public void KimlikYaz(Kisi gelenKisi)
    {
        System.out.println("\n\n*** Kimlik Belgesi ***");
        System.out.println("Adı = " + gelenKisi.ad);
        System.out.println("Soyado = " + gelenKisi.soyad);
        System.out.println("Görevi = " + gelenKisi.gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }
}
