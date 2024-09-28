package Hafta05;

import java.util.Arrays;
import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra
        // kullanıcının gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazdırınız.


        // 10 elemanlı diziyi random sayılarla doldur 3,4,5,6,7,8,9,10,2,3
        int[] dizi = new int[10];
        for (int i = 0; i < 10; i++) {
            dizi[i] = (int) (Math.random() * 11);
        }

        System.out.println("Dizi = " + Arrays.toString(dizi)); // dizi random doldu mu?

        // kullanıcıdan dizide aranacak sayıyı al
        Scanner oku = new Scanner(System.in);
        System.out.print("Aranacak Sayıyı Giriniz = ");
        int arananSayi = oku.nextInt();

        // aranan sayı dizide var ise SAYI VAR diyecek

        for (int i = 0; i < 10; i++) {

            if (dizi[i] == arananSayi) {
                System.out.println("Sayı Var" + i);
            }
        }
    }
}
