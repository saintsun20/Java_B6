package Hafta04;

public class _14_While_Soru {
    public static void main(String[] args) {
        // 1 den 100 (dahil) e kadar olan sayıların toplamını bulunuz.

        // döngünün içinde neler olacak : toplama sayacı ekle, sayacı artır
        // döngü şartı nedir? sayac <= 100

        int sayac = 1, toplam = 0;
        while (sayac <= 100)
        {
            toplam = toplam + sayac;
            sayac++;
        }

        System.out.println("toplam = " + toplam);

    }
}
