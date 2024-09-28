package Hafta03;

import java.util.Scanner;

public class _36_Soru {
    public static void main(String[] args) {
        // Girilen bir cümledeki küçük veya büyük a  harfinin olup olmadığını yazdırınız
        // VAR veya YOK şeklinde.

        // hava -> var desin
        // HAVA -> var desin

        Scanner oku = new Scanner(System.in);
        System.out.print("Cümle Giriniz = ");
        String cumle = oku.nextLine();

        boolean varMi = cumle.toLowerCase().contains("a"); // küçük harf halinde a var mı
        // boolean varMi = cumle.toLowerCase().contains("A"); // büyük harf halinde A var mı

        if (varMi == true)
            System.out.println("VAR");

        if (varMi == false)
            System.out.println("YOK");

        System.out.println("cumle = " + cumle); // yukarıdaki toLowerCase komutu değerini değiştirmez
    }
}
