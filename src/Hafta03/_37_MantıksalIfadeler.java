package Hafta03;

import java.util.Scanner;

public class _37_MantıksalIfadeler {
    public static void main(String[] args) {
        // Soru : girilen bir sayı 0 dan büyük ve 100 den küçük eşit
        // ise geçerli not, değil ise geçerli olmayan not.

        Scanner oku = new Scanner(System.in);
        System.out.print("ogrNot = " );
        int ogrNot = oku.nextInt();

        if (ogrNot >= 0 && ogrNot <= 100) // 0,0 dan büyükse VE 100,100 den küçükse
            System.out.println("Geçerli Not"); // true veya false, sonuç TRUE ise if çalışır

        //1.Yöntem
        if (ogrNot < 0 || ogrNot > 100) // 0 dan küçükse VEYA 100 den büyükse
            System.out.println("Geçerli Not Değil = ");

        //2.Yöntem
        if (!(ogrNot > 0 && ogrNot <= 100)) // burada ünlem verilen şart DEĞİLSE demektir.
            System.out.println("Geçerli Not Değil = ");
    }
}
