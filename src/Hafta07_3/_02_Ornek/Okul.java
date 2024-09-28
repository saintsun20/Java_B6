package Hafta07_3._02_Ornek;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        
        ogr1.okulNo = 5;
        ogr1.adi = "İsmet";
        ogr1.soyadi = "Temur";
        ogr1.sinifi = 7;
        ogr1.adres = "Çekmeköy";

        System.out.println("ogr1.okulNo = " + ogr1.okulNo);
        System.out.println("ogr1.adi = " + ogr1.adi);
        System.out.println("ogr1.soyadi = " + ogr1.soyadi);
        System.out.println("ogr1.sinifi = " + ogr1.sinifi);
        System.out.println("ogr1.adres = " + ogr1.adres);
                
        
    }
}

class Ogrenci{
    int okulNo;
    String adi;
    String soyadi;
    int sinifi;
    String adres;
}
