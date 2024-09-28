package Hafta10_1._02_PolySoru;

public class Calisan extends Kisi{
    private String departman;

    public Calisan(String ad, String soyad, String gorevi, String departman) {
        super(ad, soyad, gorevi);
        setDepartman(departman);
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
