package Hafta10_1._02_PolySoru;

public class OkulMain {
    public static void main(String[] args) {

        Kisi ogr1 = new Ogrenci("Ayşe", "Yılmaz", "Öğrenci", "5A");
        Kisi cal1 = new Calisan("Ali", "Demir","Yazılım", "BIM");

        ogr1.KimlikYaz(ogr1);
        cal1.KimlikYaz(cal1);
    }
}
