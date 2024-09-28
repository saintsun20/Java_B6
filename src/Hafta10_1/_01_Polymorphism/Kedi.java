package Hafta10_1._01_Polymorphism;

public class Kedi extends Hayvan{

    public Kedi(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("miyavladı");
    }

    public void tirmaladi() {
        System.out.println("tırmaladı");
    }

}

