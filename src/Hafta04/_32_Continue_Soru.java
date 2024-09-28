package Hafta04;

import java.util.Scanner;

public class _32_Continue_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker
        // ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın. (continue kullanınız.)

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz = ");
        String cumle = oku.nextLine();

        for (int i = 0; i < cumle.length(); i++) {

            char harf = cumle.charAt(i); // 0,1,2,3,4,5,6

            if (harf != ' ') // boşluk değilse yaz
                System.out.println("harf = " + harf);
        }

        //2.yol
        for (int i = 0; i < cumle.length(); i++) {

            char harf = cumle.charAt(i); // 0,1,2,3,4,5,6

            if (harf == ' ') // harf gelirse pass geç, bir sonraki adımdan devam et
                continue;

            System.out.println("harf = " + harf);
        }
    }
}
