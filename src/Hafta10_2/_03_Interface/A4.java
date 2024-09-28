package Hafta10_2._03_Interface;

public class A4 implements IYazdirir, IGosterir{
    @Override
    public void goster() {
        System.out.println("Gösterildi.");
    }

    @Override
    public void yazdir() {
        System.out.println("Yazdırıldı.");

    }
}
