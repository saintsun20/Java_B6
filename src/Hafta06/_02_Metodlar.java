package Hafta06;

import java.util.Scanner;

public class _02_Metodlar {
    public static void main(String[] args) {
        // 1.Yöntem
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi1 = "); int sayi1 = oku.nextInt();
        System.out.print("Sayi2 = "); int sayi2 = oku.nextInt();

        if (sayi1 > sayi2)
            System.out.println("enb = " + sayi1);
        else
            System.out.println("enb = " + sayi2);

        //2.Yöntem
        enbOkuBulYaz(); // param almıyor, geri değer vermiyor
        enbBulYaz(sayi1,sayi2); // param alıyor, geri değer vermiyor

        int enb = Math.max(sayi1,sayi2); // param alıyor, geri değer veriyor, yani fonksiyon eşit işareti değer verir

        int enb2 = enbBuyukBulVer(sayi1,sayi2); // param alıyor ve değer döndürüyor
        System.out.println("enb2 = " + enb2);
    }

    public static int enbBuyukBulVer(int sayi1, int sayi2){
        int enb = 0;

        if (sayi1 > sayi2)
            enb = sayi1;
        else
            enb = sayi2;

        return enb; // dönenin tipi void in yerine yazılır, void tipsiz
    }

    public static void enbBulYaz(int sayi1, int sayi2){
        if (sayi1 > sayi2)
            System.out.println("enb = " + sayi1);
        else
            System.out.println("enb = " + sayi2);
    }

    public static void enbOkuBulYaz(){
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi1 = "); int sayi1=oku.nextInt();
        System.out.print("Sayi2 = "); int sayi2=oku.nextInt();

        if (sayi1 > sayi2)
            System.out.println("enb = " + sayi1);
        else
            System.out.println("enb = " + sayi2);
    }



}
