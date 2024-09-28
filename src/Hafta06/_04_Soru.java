package Hafta06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // kullanıcıdan main de bir sayı alınız, bu sayıya kadar olan sayıların toplamını
        // bir fonksiyonda buldurup mainden yazdırınız
        // 5 -> 1+2+3+4+5

        // sayı oku
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi = "); int sayi = oku.nextInt();

        int top = sayiyaKadarTopla(sayi);  // return var sa void yok, ve metod eşitleyebilme var

        // toplamın sonucu burada yazdırılacak
        System.out.println("toplam = " + top);
    }

    // metodda ise bu sayıya kadar olan sayılan toplamını bulacaksınız
    public static int sayiyaKadarTopla(int sayi){
        int toplam = 0;
        for (int i = 0; i <= sayi ; i++)
            toplam = toplam+i;

        return toplam;
    }
}

