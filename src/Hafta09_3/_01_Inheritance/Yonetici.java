package Hafta09_3._01_Inheritance;

public class Yonetici {

    private String ad;
    private String soyad;
    private int yas;
    private double maas;
    private String departman;
    private int sicilNo;
    private String telefon;

    public void bordroYazdir()
    {
        System.out.println("Bordro yazdırıldı");
    }

    public void zamYap()
    {
        System.out.println("Zamlar yapıldı");
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

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Yonetici{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", maas=" + maas +
                ", departman='" + departman + '\'' +
                ", sicilNo=" + sicilNo +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
