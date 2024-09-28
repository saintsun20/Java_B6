package Hafta09_2._02_Soru;

public class ArabamCom {
    public static void main(String[] args) {
        Araba a1=new Araba();
        a1.setRenk("Kırmızı");
        a1.setKapiSayisi(9);
        a1.setMotorHacmi(1900);
        a1.setUretimYili(2000);


        System.out.println(a1);


        Araba a2=new Araba("Siyah",2024,1900,12);
        System.out.println("a2 = " + a2);
    }
}
