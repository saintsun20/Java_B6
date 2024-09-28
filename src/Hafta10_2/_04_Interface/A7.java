package Hafta10_2._04_Interface;

public class A7 implements IGosterir, IYazdirir{
    @Override
    public void goster() {
        System.out.println("Gösterildi.");
    }

    @Override
    public void yazdir() {
        System.out.println("Yazdırıldı.");

    }

    @Override
    public void yazdir(String mesaj) {
        System.out.println(mesaj);

    }
}
