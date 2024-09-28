package Hafta09_3._02_Inheritance;

public class Kedi extends Hayvan {
    public Kedi(String renk, double kilo, int no, int yas) {
        super(renk, kilo, no, yas);
    }

    public void konustu()
    {
        // super.konustu();
        System.out.println("Miyavladı!");
    }
}
