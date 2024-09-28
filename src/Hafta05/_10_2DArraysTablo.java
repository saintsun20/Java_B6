package Hafta05;

public class _10_2DArraysTablo {
    public static void main(String[] args) {
        int sayi=5; // müstakil ev kendi başına 1 ev
        int[] dizi = new int[10]; // apartman 10 daire var

        int[] dizi1 = new int[10]; // bayrak 1 apartmanı
        int[] dizi2 = new int[10]; // bayrak 2 apartmanı
        int[] dizi3 = new int[10]; // bayrak 3 apartmanı

        // bayrak sitesi
        int [][] site = new int[3][10]; // 3 apartman * 10 daire
                                        // 3 satır * 10 sütun toplam:30
        // site[1.apartman][1.dairesi]
        site[0][0] = 5;  // 1.Apartmanın, 1.Dairesi
        site[0][1] = 65; // 1.Apartmanın, 2.Dairesi
    }
}
