package Hafta02;

import java.util.Scanner;

public class _32_Soru {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Uzun Kenar = "); int uzun = oku.nextInt();

        System.out.print("Kısa Kenar = "); int kisa = oku.nextInt();

        int cevre = uzun+kisa+uzun+kisa;
        System.out.println("Çevre = " + (2*uzun+2*kisa));

        int alan = uzun*kisa;
        System.out.println("Alan = " + (uzun*kisa));

    }
}
