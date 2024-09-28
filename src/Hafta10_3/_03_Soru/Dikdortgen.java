package Hafta10_3._03_Soru;

public class Dikdortgen extends Sekil {
    private int kisaKenar;
    private int uzunKenar;

    public Dikdortgen(String name, int kisaKenar, int uzunKenar) {
        super(name);
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    @Override
    void alan() {
        System.out.println("Alan = " + (this.uzunKenar*this.kisaKenar));
    }

    @Override
    void cevre() {
        System.out.println("Çevre = " + ((this.uzunKenar+this.kisaKenar)*2));
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
