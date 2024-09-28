package Hafta03;

import java.util.Scanner;

public class _47_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        // olduğunu Ternary Operatör ile yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = oku.nextInt();

        String sonuc= sayi == 0 ? "Sıfır" : (sayi>0 ? "Pozitif" : "Negatif");

        if (sayi == 0)
            System.out.println("Sıfır");
        else
        {
            if (sayi>0)
                System.out.println("Pozitif");
            else
                System.out.println("Negatif");

        }

    }
}
