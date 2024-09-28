package Hafta04;

import java.util.Scanner;

public class _16_Aciklama {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int sayi = 0, toplam = 0;

        do{
            System.out.print("Sayi = ");
            sayi = oku.nextInt();
            toplam = toplam + sayi;
        }while (sayi != 0);

        System.out.println("toplam = " + toplam);
    }
}
// While : önce kontrol sonra döngü
// do_while : önce 1 kez çalış, sonra kontrol, sonra döngü
