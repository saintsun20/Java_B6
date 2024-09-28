package Hafta04;

import java.util.Scanner;

public class _22_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan gireceği bir rakama(dahil) kadar
        // olan sayıların toplamını bulunuz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Kaça Kadar Sayıları Toplayalım = ");
        int sinir = oku.nextInt();

        int toplam = 0;
        for (int i = 0; i <= sinir; i++) {
            toplam = toplam+i;
        }

        System.out.println("toplam = " + toplam);

    }
}
