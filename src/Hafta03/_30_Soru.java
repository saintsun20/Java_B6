package Hafta03;

import java.util.Scanner;

public class _30_Soru {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdırınız. (Eşit veya değil)

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi1 = ");
        int sayi1= oku.nextInt();

        System.out.print("Sayi2 = ");
        int sayi2= oku.nextInt();

        if (sayi1 == sayi2) { // Parantez yapılacak satır 1 den fazla ise şart
            System.out.println("Eşit");
        }

        if (sayi1 != sayi2)  // Yapılacak satır, 1 tane ise parantez ŞART DEĞİL.
            System.out.println("Eşit Değil");
    }
}
