package Hafta08_2._03_Constructor;

public class BDDK {
    public static void main(String[] args) {
        Banka b1 = new Banka();
        b1.adi = "Ziraat";
        b1.kurulusYili = 1908;
        b1.subeSayisi = 2000;

        Banka b2 = new Banka("Kuveyt Türk", 500);

        Banka b3 = new Banka("Garanti", 1000, 1980);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

    }
}
