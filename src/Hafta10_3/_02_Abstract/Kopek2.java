package Hafta10_3._02_Abstract;

public class Kopek2 extends Hayvan2{

    public Kopek2(String cinsi, int yas) {
        super(cinsi, yas);
    }

    @Override
    void ses() {
        System.out.println("Havladı");

    }

    @Override
    void yemek() {
        System.out.println("Et ve kemik yedi.");

    }
}
