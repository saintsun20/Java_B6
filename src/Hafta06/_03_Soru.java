package Hafta06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de tek mi çift mi olduğunu bulunuz.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi1 = "); int sayi1 = oku.nextInt();
        System.out.print("Sayi2 = "); int sayi2 = oku.nextInt();

        int enb = enBuyukBul(sayi1,sayi2); // metodun eşitlenebilmesi için RETURN e sahip olması gerekir
        System.out.println("enb = " + enb);
        if (enb %2 == 0)
            System.out.println("Çift");
        else
            System.out.println("Tek");

    }


    public static int enBuyukBul(int sayi1, int sayi2){
        int enb = 0;
        if (sayi1 > sayi2)
            enb = sayi1;
        else
            enb = sayi2;

        return enb; // return sayi1 > sayi2 ? sayi : sayi2;

    }
}
