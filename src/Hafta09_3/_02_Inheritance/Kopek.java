package Hafta09_3._02_Inheritance;

public class Kopek extends Hayvan{

    public Kopek(String renk, double kilo, int no, int yas) {super(renk, kilo, no, yas);}

    @Override
    public void konustu() {
        // super.konustu(); // konuştu
        System.out.println("Havladı");
    }
}
