package Hafta05;

public class _04_JavaArray {
    public static void main(String[] args) {
        int[] dizi = new int[5]; // kutular boş, int sayi:

        int[] dizi2 = {4, 6, 7, 8, 33, 44}; // 6 elemanlı bir dizi, int sayi=45

        int dizi3[] = {4, 6, 7, 8, 33, 44}; // 6 elemanlı bir dizi, int sayi=45


        String[] kelimeler = new String[5]; // 5 elemanlı, String saklayabilen 5 kutu
        boolean[] evetHayirdizisi = new boolean[5]; // 5 elemanlı, boolean saklayabilen 5 kutu
        double[] oranlar = new double[5]; // 5 elemanlıi double saklayabilen 5 kutu

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("int dizi = " + dizi[i]);
        }

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler dizi = " + kelimeler[i]);
        }

        for (int i = 0; i < evetHayirdizisi.length; i++) {
            System.out.println("evetHayirdizisi dizi = " + evetHayirdizisi[i]);
        }

        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("oranlar dizi = " + oranlar[i]);
        }
    }
}