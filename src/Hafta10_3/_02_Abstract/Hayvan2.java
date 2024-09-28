package Hafta10_3._02_Abstract;

// miras + şablon 2 si birarada
// abstract = sonradan içi doldurulacak metod demek
public abstract class Hayvan2 {
    private String cinsi;
    private int yas;

    public Hayvan2(String cinsi, int yas) {
        setCinsi(cinsi);
        setYas(yas);
    }

    abstract void ses();
    abstract void yemek();


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
