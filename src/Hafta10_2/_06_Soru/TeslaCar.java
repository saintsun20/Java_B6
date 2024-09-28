package Hafta10_2._06_Soru;

public class TeslaCar extends Vehicle implements IElektrik{
    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeBattery() {
        System.out.println("Her 100000 de bir battery değiştir.");
    }

    @Override
    public String drive() {
        return "Autor Drive";
    }
}
