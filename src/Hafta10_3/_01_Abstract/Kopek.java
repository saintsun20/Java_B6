package Hafta10_3._01_Abstract;

public class Kopek extends Hayvan implements IHayvan{
    public Kopek(String cinsi, int yas) {
        super(cinsi, yas);
    }

    @Override
    public void ses() {
        System.out.println("Havladı");
    }
}
