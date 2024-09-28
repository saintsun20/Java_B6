package Hafta05;

public class _16_2DArrays {
    public static void main(String[] args) {
        int[][] tablo = new int[2][3]; // int sayi:     int[] dizi = new int[5];

        int[][] tablo1 = {               // int sayi = 5; int[] dizi = {34,5,6,77,88};
                {34,55,6},
                {32,77,89},
        };      // ilk değerlerini atayarak boyutlarını da belirlemiş olursun

        // normal bir sayı için;
        int sayi = 5;
        sayi = 6;
        sayi = 10;

        // tek boyutlu için
        int[] dizi = new int[10];
        dizi = new int[5]; // içinde değer var ise gider
        dizi = new int[7]; // içinde değer var ise gider, son hali geçerli


        // 2 boyutlu dizilerde
        tablo = new int[3][4]; // 2DArray i tümünü yeniden oluşturdum.

        tablo[0] = new int[10]; // herhangi bir satırı yeniden boyutlandirabiliriz
                                // tüm satırlar aynı uzunlukta olmak zorunda değil.

        int [][] tablo3 ={      //atadığınız değerlerin miktarı boyutları belirler
                {23,44},
                {34,56,56,76,8,89,9},
                {5}
        };

        for (int i = 0; i < tablo3.length; i++) {

            for (int j = 0; j < tablo3[i].length; j++) { // her bir satırın uzunluğu kadar
                System.out.print(tablo3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
