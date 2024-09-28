package Hafta10_2._06_Soru;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeDiesel() {
        System.out.println("Diesel al her 700 km de.");
    }

    @Override
    public String drive() {
        return "Yavaş sür.";
    }
}
