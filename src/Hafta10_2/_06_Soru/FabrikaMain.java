package Hafta10_2._06_Soru;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar tc = new TeslaCar("model 5", 310);
        tc.changeBattery();
        System.out.println(tc.drive());

        ToyotaPrius tp = new ToyotaPrius("Sedan", 1200);
        tp.changeOil();
        tp.changeBattery();
        System.out.println(tp.drive());

        Bus b = new Bus("IVECO", 7000);
        b.changeDiesel();
        System.out.println(b.drive());
    }
}
