package Hafta10_2._05_Soru;

public class GeoMain {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen(4,5);
        System.out.println(d.alan());
        System.out.println(d.cevre());

        Kare k=new Kare(6);
        System.out.println(k.alan());
        System.out.println(k.cevre());

    }
}
