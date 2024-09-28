package Hafta03;

import java.util.Scanner;

public class _35_Soru {
    public static void main(String[] args) {
        // Girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Cümle Giriniz = ");
        String cumle = oku.nextLine();

        boolean varMı = cumle.contains("a");

        if (varMı == true)
            System.out.println("EVET");

        if (varMı == false)
            System.out.println("HAYIR");


    }
}
