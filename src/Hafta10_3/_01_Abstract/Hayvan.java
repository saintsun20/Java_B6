package Hafta10_3._01_Abstract;

public class Hayvan {
    private String cinsi;
    private int yas;

    public Hayvan(String cinsi, int yas) {
        setCinsi(cinsi);
        setYas(yas);
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
