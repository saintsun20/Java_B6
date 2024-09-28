package Hafta09_3._02_Inheritance;

public class Hayvan {
    private String renk;
    private double kilo;
    private int no;
    private int yas;

    public Hayvan(String renk, double kilo, int no, int yas){
        setRenk(renk);
        setKilo(kilo);
        setNo(no);
        setYas(yas);
    }

    public void konustu() {System.out.println("Ses Çıkardı!");}

    public String getRenk() {return renk;}

    public void setRenk(String renk) {this.renk = renk;}

    public double getKilo() {return kilo;}

    public void setKilo(double kilo) {this.kilo = kilo;}

    public int getNo() {return no;}

    public void setNo(int no) {this.no = no;}

    public int getYas() {return  yas;}

    public void setYas(int yas) {this.yas = yas;}

    @Override
    public String toString() {
        return "Hayvan{" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", no=" + no +
                ", yas=" + yas +
                '}';
    }
}
