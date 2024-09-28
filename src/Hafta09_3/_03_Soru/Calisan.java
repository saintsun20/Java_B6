package Hafta09_3._03_Soru;

public class Calisan {
    private String isim;
    private double tabanAylik;
    private int maasKatSayisi;

    public Calisan(String isim, double tabanAylik, int maasKatSayisi) {
        setIsim(isim);
        setTabanAylik(tabanAylik);
        setMaasKatSayisi(maasKatSayisi);
    }

    public double maasHesapla()
    {
        return this.tabanAylik*this.maasKatSayisi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getTabanAylik() {
        return tabanAylik;
    }

    public void setTabanAylik(double tabanAylik) {
        this.tabanAylik = tabanAylik;
    }

    public int getMaasKatSayisi() {
        return maasKatSayisi;
    }

    public void setMaasKatSayisi(int maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan" +
                "isim='" + isim + '\'' +
                ", tabanAylik=" + tabanAylik +
                ", maasKatSayisi=" + maasKatSayisi
                ;
    }
}

