package Hafta07_4_Gun25._01_Ornek;

public class KampusMain {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();
        // Ogrenci TİP, ogr1 ise NESNE

        ogr1.okulNo=5;
        ogr1.adi="Halil";
        ogr1.soyadi="Özçakmak";
        //ogr1.okulu=new Okul(); / ya tanımda ya da burada
        ogr1.okulu.okulAd="Atatürk Okulu";
        ogr1.okulu.adresi="Çekmeköy";
        ogr1.okulu.mudurAdi="Ümmühan Teke";
        ogr1.okulu.telefonu="0216444444";

        System.out.println(ogr1.okulNo);
        System.out.println(ogr1.adi);
        System.out.println(ogr1.soyadi);
        System.out.println(ogr1.okulu.okulAd);
        System.out.println(ogr1.okulu.adresi);
        System.out.println(ogr1.okulu.mudurAdi);
        System.out.println(ogr1.okulu.telefonu);

    }
}
