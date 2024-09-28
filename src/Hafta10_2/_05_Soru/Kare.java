package Hafta10_2._05_Soru;

public class Kare implements IGeometri{
    private int kenar;

    public Kare(int kenar) {
        setKenar(kenar);
    }
    @Override
    public double alan() {
        return kenar*kenar;
    }

    @Override
    public double cevre() {
        return kenar*4;
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }


}
