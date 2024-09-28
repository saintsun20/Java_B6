package Hafta10_3._03_Soru;

public class Daire extends Sekil{
    private int yaricap;

    public Daire(String name, int yaricap) {
        super(name);
        setYaricap(yaricap);
    }

    @Override
    void alan() {
        System.out.println("Alan = " + (Math.PI*this.yaricap*this.yaricap));
    }

    @Override
    void cevre() {
        System.out.println("Çevre = " + (2 * Math.PI*yaricap));
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }
}
