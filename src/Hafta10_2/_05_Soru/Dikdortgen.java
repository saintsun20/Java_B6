package Hafta10_2._05_Soru;

public class Dikdortgen implements IGeometri{
    private int uzunKenar;
    private int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        setUzunKenar(uzunKenar);
        setKisaKenar(kisaKenar);
    }

    @Override
    public double alan() {
        return this.uzunKenar*this.kisaKenar;
    }

    @Override
    public double cevre() {
        return (this.uzunKenar+this.kisaKenar)*2;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }


}
