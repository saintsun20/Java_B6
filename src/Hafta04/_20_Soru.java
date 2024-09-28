package Hafta04;

public class _20_Soru {
    public static void main(String[] args) {
        // 5 den 65(dahil) e kadar olan sayıların toplamını bulup yazdırınız.

        int toplam = 0;
        for (int i = 5; i <= 65 ; i++)  // i:sayac
        {
            toplam = toplam + i;
        }

        System.out.println("toplam = " + toplam);


    }
}
