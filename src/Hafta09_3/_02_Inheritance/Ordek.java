package Hafta09_3._02_Inheritance;

public class Ordek extends Hayvan{
    private int kanatUzunluğu;


    public Ordek(String renk, double kilo, int no, int yas, int kanatUzunluğu) {super(renk, kilo, no, yas);}

    @Override
    public String toString() {
        return super.toString() + " , ku" + this.kanatUzunluğu;}

    @Override
    public void konustu() {System.out.println("Vak Vakladı");}

    public int getKanatUzunluğu() {return kanatUzunluğu;}

    public void setKanatUzunluğu(int kanatUzunluğu) {
        this.kanatUzunluğu = kanatUzunluğu;
    }
}

