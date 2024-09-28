package Hafta09_2._03_Soru;

import java.util.ArrayList;

public class Okul {
    private String ad;
    private int kontenjan;
    private ArrayList<Ogrenci> ogrencileri = new ArrayList<>();

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public ArrayList<Ogrenci> getOgrencileri() {
        return ogrencileri;
    }

    public void setOgrencileri(ArrayList<Ogrenci> ogrencileri) {
        this.ogrencileri = ogrencileri;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "ad='" + ad + '\'' +
                ", kontenjan=" + kontenjan +
                ", ogrencileri=" + ogrencileri +
                '}';
    }
}
