package Hafta02;

import java.util.Scanner;

public class _34_Soru {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Boyunuz (m)  = "); double boy= oku.nextDouble();
        System.out.print("Kilonuz (Kg) = "); double kilo= oku.nextDouble();

        System.out.println("Boyunuz = " + boy + "m ve kilonuz = " + kilo + "kg");

        double index= kilo / (boy+boy);
        System.out.println("Vücut Kitle Indexiniz = " + index);
    }
}
