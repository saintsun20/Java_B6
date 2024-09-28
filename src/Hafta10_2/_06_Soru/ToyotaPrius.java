package Hafta10_2._06_Soru;

public class ToyotaPrius extends Vehicle implements IElektrik,IGas{
    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeBattery() {
        System.out.println("10 bin de bir battery değiştir.");
    }

    @Override
    public void changeOil() {
        System.out.println("Her 500 km de Benzin al.");
    }

    @Override
    public String drive() {
        return "İstediğin gibi sür.";
    }
}
