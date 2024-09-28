package Hafta03;

import java.util.Scanner;

public class _29_JavaIf {
    public static void main(String[] args) { // 1-Başla
        // Baklava dilimi : if
        // Girilen bir sayı 10 dan büyük ise "10 dan büyük" yazdırınız
        //1-Başla
        //2-sayi oku
        //3-sayi > 10 ise "10 dan büyük" yaz
        //4-Dur

        // sayi oku
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz = ");
        int sayi= oku.nextInt();

        //3-sayi > 10 ise "10 dan büyük" yaz
        if (sayi > 10)  // eğer sayi 10 dan büyük ise
        {
            System.out.println("10 dan büyük");
        }

    }// dur
}
