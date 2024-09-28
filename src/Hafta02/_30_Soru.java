package Hafta02;

import java.util.Scanner;

public class _30_Soru {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi1 = ");
        int sayi1=oku.nextInt();

        System.out.print("Sayi2 = ");
        int sayi2= oku.nextInt();

        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);

    }
}
