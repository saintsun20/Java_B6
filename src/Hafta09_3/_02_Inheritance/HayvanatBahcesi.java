package Hafta09_3._02_Inheritance;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi k1 = new Kedi("Siyah", 3, 1, 6);
        k1.konustu();

        Kopek kp1 = new Kopek("Beyaz", 20, 2, 10);

        Ordek or1 = new Ordek("Gövel", 5, 3, 6, 100);
        or1.konustu();
        System.out.println(or1.getKanatUzunluğu());
        System.out.println("or1 = " + or1);

        Yilan yl1 = new Yilan("Siyah", 6,4, 10, "Kara Zehir");
        yl1.konustu();
    }
}
